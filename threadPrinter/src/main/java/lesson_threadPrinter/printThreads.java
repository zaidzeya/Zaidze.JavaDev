package lesson_threadPrinter;

import java.util.concurrent.TimeUnit;

public class printThreads implements Runnable{
	public static void main(String[] args) {}

	@Override
	synchronized public void run() {
		String str = "1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1";
		String[] words = str.split(" ");

		for (String word : words) {
			if (Thread.currentThread().getName().equals("Thread #1")) {
				System.out.println("Поток '"+Thread.currentThread().getName()+"': "+word);
			} else {
				System.out.println("Поток '"+Thread.currentThread().getName()+"': "+"  " + word);
			}
			try {
				notify();
				Thread.sleep( TimeUnit.MILLISECONDS.toMillis( 250 ) );
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Thread.currentThread().interrupt();
		notifyAll();
	}
}

