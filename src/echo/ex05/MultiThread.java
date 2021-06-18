package echo.ex05;

public class MultiThread {
	public static void main(String[] args) {

		Thread thread01 = new Thread(new DigitRunnableImpl());
		Thread thread02 = new Thread(new UpperRunnableImpl());
		Thread thread03 = new Thread(new LowerRunnableImpl());

		thread01.start();
		thread02.start();
		thread03.start();
	}

}
