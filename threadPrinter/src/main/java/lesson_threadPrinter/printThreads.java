package lesson_threadPrinter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class printThreads implements Runnable{
	private static final Logger logger = LoggerFactory.getLogger(printThreads.class);
	private final String str = "1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1";
	private String last = "Thread 2";

	@Override
	synchronized public void run() {
		String[] words = str.split(" ");

		for (String word : words) {
			try {
				if (last.equals(Thread.currentThread().getName())) {
					this.wait();
				}
				logger.info(word);
				last = Thread.currentThread().getName();
				sleep();
				notifyAll();
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
				throw new NotInterestingException(ex);
			}
		}
	}

	private static void sleep() {
		try {
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
			Thread.currentThread().interrupt();
		}
	}

	private static class NotInterestingException extends RuntimeException {
		NotInterestingException(InterruptedException ex) {
			super(ex);
		}
	}

	public static void main(String[] args) {}
}

