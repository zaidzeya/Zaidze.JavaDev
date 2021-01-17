package lesson_threadPrinter;

public class RunnerLoveJava {
	public static void main(String[] args) {

		loveJava inc = new loveJava();

		Thread firstThread = new Thread(inc);
		firstThread.setName("Thread 1");

		Thread secondThread = new Thread(inc);
		secondThread.setName("Thread 2");

		firstThread.start();
		secondThread.start();
	}
}
