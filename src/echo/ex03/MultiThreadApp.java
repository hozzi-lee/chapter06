package echo.ex03;

public class MultiThreadApp {
	public static void main(String[] args) throws Exception {

		/*
		Thread thread = new DigitThread();
		//		thread.run();
		thread.start(); // start() 내부에서 준비 --> run() 을 호출

		for ( char ch = 'A'; ch <= 'Z'; ch++ ) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		 */
		
		// 시간순 --> 독립 실행
		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThread();
		Thread thread3 = new UpperThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
