package ex13_thread;
//스레드만들기
//class MyRunn implements Runnable{
//	@Override
//	public void run() {
//		for(int i = 0; i<10; i++) {
//			System.out.println("Runnable Thread "+(i+1));
//		}
//	}
//}

public class J20210507_07_Runnable {

	public static void main(String[] args) {
		//MyRunn myRun = new MyRunn();		
		//th.start();//스레드 시작
		//myRun.run();//run만실행

		//Runnable을 상속받는 익명클래스 생성하여 Thread 실행--------
//		Runnable myRun = new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i = 0; i<10; i++) {
//					System.out.println("Runnable Thread "+(i+1));
//				}
//			}
//		};
//		Thread th = new Thread();
//		th.start();
		
		//Thread 매개변수에 Runnable 익명클래스 입력------------------
		//h.setPriority(1~10)숫자가 클수록 우선순위가 높다.
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.println("Thread1★ "+(i+1));
				}
				
			}
		});
		th.setPriority(1);
		th.start();
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.println("Thread2★ "+(i+1));
				}
				
			}
		});
		th2.setPriority(10);
		th2.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("Main★ "+(i+1));
		}
		
		
	} 
	
}
