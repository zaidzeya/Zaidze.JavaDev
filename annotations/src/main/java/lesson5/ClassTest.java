package lesson5;


public class ClassTest
{
	private final int param1;
	private final String param2;
	private final int param3;
	public static int a;
	public static int b;
	public static int c;
	public boolean result;

	public ClassTest(int param1, String param2, int param3) {
			this.param1 = param1;
			this.param2 = param2;
			this.param3 = param3;
	}

	@Before
	public void methodBefore() {
		System.out.println("_____________");
		System.out.println("Начало (Before)");
		a = 100;
		b = 22;
		c = 88;
		System.out.println("Параметры, переданные на вход: " + this.param1 + " , " + this.param2 + " , " + this.param3);
		System.out.println("_____________");
	}

	@Test
	public void methodTest1() {
		System.out.println("Запуск Test 1");
		result = a > param1;
		System.out.println("Результат сравнения Test 1: " + result);
		System.out.println("_____________");
	//	throw new RuntimeException();
	}

	@Test
	public void methodTest2() {
		System.out.println("Запуск Test 2");
		result = "правда".equals(param2);
		System.out.println("Результат сравнения Test 2: " + result);
		System.out.println("_____________");
	}

	@Test
	public void methodTest3() {
		System.out.println("Запуск Test 3");
		result = c > (b + param3);
		System.out.println("Результат сравнения Test 3: " + result);
		System.out.println("_____________");
	}

	@After
	public void methodAfter() {
		a = 0;
		b = 0;
		c = 0;
		System.out.println("Конец (обнуление переменных в After)");
	}


}
