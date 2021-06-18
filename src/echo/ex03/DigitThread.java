package echo.ex03;

public class DigitThread extends Thread {
	
	// field
	
	// constructors
	
	// method getter/setter
	
	// method
	@Override
	public void run() {
		// 우리 로직은 반드시 run() 에 작성해야 함
		for ( int i = 0; i < 10; i++ ) {
			System.out.println(i);
			try {
				Thread.sleep(900);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
