package lesson_threadPrinter;

public class runnerPrintThreads {
	public static void main(String[] args) {
		printThreads printThreads = new printThreads();

		Thread firstThread = new Thread(printThreads);
		firstThread.setName("Thread 1");

		Thread secondThread = new Thread(printThreads);
		secondThread.setName("Thread 2");

		firstThread.start();
		secondThread.start();
	}
}
