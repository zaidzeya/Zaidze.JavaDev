package lesson5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassRun {
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<?> clazz = ClassTest.class;
		Constructor constructor = clazz.getConstructor(int.class);
		Object object1 = constructor.newInstance(10);
		Object object2 = constructor.newInstance(20);

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
		}
		System.out.println(ann1);

		for (Method method : clazz.getDeclaredMethods()){
			if (method.isAnnotationPresent(Test.class)) {
				ann2.add(method);
			}
		}
		System.out.println(ann2);

		for (Method method : clazz.getDeclaredMethods()){
			if (method.isAnnotationPresent(After.class)) {
				ann3.add(method);
			}
		}
		System.out.println(ann3);

		for (Method method : ann1){
				objects.forEach(object -> {
					try {
						method.invoke(object);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				});
		}

		for (Method method : ann2){
			objects.forEach(object -> {
				try {
					method.invoke(object);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			});
		}


	}


}
