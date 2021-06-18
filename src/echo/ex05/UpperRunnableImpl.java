package echo.ex05;

public class UpperRunnableImpl implements Runnable {

	// field

	// constructors

	// method getter/setter

	// method
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
