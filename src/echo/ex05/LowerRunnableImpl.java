package echo.ex05;

public class LowerRunnableImpl implements Runnable {

	// field

	// constructors

	// method getter/setter

	// method
	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
