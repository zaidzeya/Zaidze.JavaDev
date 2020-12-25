package lesson5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassRun {
	private int errorCount;

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		ClassRun run = new ClassRun();

		Class<?> clazz = ClassTest.class;
		Constructor constructor = clazz.getConstructor(int.class, String.class, int.class);
		Object object1 = constructor.newInstance(122, "истина", 1000);
		Object object2 = constructor.newInstance(56, "ложь", 55);

		List<Object> objects = new ArrayList<>();
		objects.add(object1);
		objects.add(object2);

		List<Method> ann1 = new ArrayList<>();
		List<Method> ann2 = new ArrayList<>();
		List<Method> ann3 = new ArrayList<>();

		for (Method method : clazz.getDeclaredMethods()){
			if (method.isAnnotationPresent(Before.class)) {
				ann1.add(method);
			}
			if (method.isAnnotationPresent(Test.class)) {
				ann2.add(method);
			}
			if (method.isAnnotationPresent(After.class)) {
				ann3.add(method);
			}
		}

		for (Method method : ann1){
			objects.forEach(object -> {
				run.callMethod(method, object);
			});
		}
		for (Method method : ann2) {
			objects.forEach(object -> {
				run.callMethod(method, object);
			});
		}
		for (Method method : ann3) {
			objects.forEach(object -> {
				run.callMethod(method, object);
			});
		}

		System.out.println("Итоги прогона тестов. Всего было: " + ann2.size() * objects.size());
		System.out.println("Упало с ошибкой: " + run.getErrorCount());

	}

	public Object callMethod(Method method, Object object){
		Object result = "";
		try {
			result = method.invoke(object);
		} catch (IllegalAccessException e) {
			printError("Ошибка в callMethod " + method + " ,текст ошибки: " + e.toString());
		} catch (InvocationTargetException e) {
			printError("Ошибка в callMethod " + method + " ,текст ошибки: " + e.toString());
		} catch (Exception e) {
			printError("Непредвиденная ошибка в callMethod " + method + " ,текст ошибки: " + e.toString());
		}
		return result;
	}

	private void printError(String text){
		System.out.println(text);
		errorCount++;
	}

	public int getErrorCount(){
		return errorCount;
	}
}
