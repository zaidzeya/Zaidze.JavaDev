package lesson5;


import org.junit.jupiter.api.DisplayName;


public class ClassTest
{
	private final int param;
	public static int a;
	public static int b;
	public static int c;
	public boolean result;

	public ClassTest(int param) {
		this.param = param;
	}

	@Before
	public void methodBefore() {
		System.out.println("Начало");
		a = 11;
		b = 2;
		c = 33;
		System.out.println(this.param);
	}

	@Test
	public void methodTest1() {
		System.out.println("Запуск Test 1");
		result = a > param;
		System.out.println(result);

	}

	@Test
	public void methodTest2() {
		System.out.println("Запуск Test 2");
		result = a > b;
		System.out.println(result);

	}

	@After
	public void methodAfter() {
		a = 0;
		b = 0;
		c = 0;
		System.out.println("Finish");
	}


}
