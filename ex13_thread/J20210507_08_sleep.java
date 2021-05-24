package ex13_thread;

public class J20210507_08_sleep {

	public static void main(String[] args) throws InterruptedException {
//		for (int i = 1; i<6; i++) {
//			Thread.sleep(1000);
//			System.out.println(i);
//		}

		//CountDown Program
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 5; i>0; i--) {
					try {
						//우선순위가 낮은 스레드가 기아상태빠지는 것을 방지
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		});
		th.start();
		
		System.out.println("Main Thread End");
	}

}
