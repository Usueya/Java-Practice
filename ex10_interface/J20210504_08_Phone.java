package ex10_interface;

interface Call{
	void call();
}
interface Photo{
	void photo();
}
interface Memo{
	void memo();
}
class Phone implements Call, Photo{
	@Override
	public void photo() {
		System.out.println("사진기능(500화소)");
	}
	@Override
	public void call() {
		System.out.println("전화기능(발신/수신)");
	}
}
class NewPhone implements Call, Photo, Memo{
	@Override
	public void memo() {
		System.out.println("메모기능");
	}
	@Override
	public void photo() {
		System.out.println("사진기능(1000화소)");
	}
	@Override
	public void call() {
		System.out.println("전화기능(발신/수신/영상)");
	}
}
class PhoneUse{
	void memo(Memo memo) {
		memo.memo();
	}
	void call(Call call) {
		call.call();
	}
	void photo(Photo photo) {
		photo.photo();
	}
}

public class J20210504_08_Phone {

	public static void main(String[] args) {
		PhoneUse pu = new PhoneUse();
		Phone oldp = new Phone();
		NewPhone newp = new NewPhone();
		
		pu.call(oldp);
		pu.photo(oldp);
		pu.memo(newp);

	}

}
