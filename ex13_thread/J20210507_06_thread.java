package ex13_thread;
//program:소스를 컴파일해서 실행코드로 변환된 파일 (c->exe, java->class..등)
//process:program을 cpu에 의해 실행된(메모리에 올라간) 상태
//thread:process내에서 실행되는 세부 실행단위(main도 하나의 스레드)
//multi thread:하나의 프로세스내에서 여러개의 스레드가 병행처리
//java가 multi thread로 동작!
//os - jvm - class
//스레드 스케쥴링: jvm의 스레드 스케쥴러가 각 스레드에게 cpu를 할당하여 실행

//스레드 만들기(상속받기): 다른 상속을 못받는다는 단점
class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("thread1: "+(i+1));
		}
	}
	
}
public class J20210507_06_thread {

	public static void main(String[] args) {
		//스레드 객체
		Thread1 t1  = new Thread1();
		t1.start(); //스레드실행
		
		for(int i =0;i<10;i++) {
			System.out.println("main: "+(i+1));
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("for: "+((i+1)*10));
		}
				
		
	}

}
