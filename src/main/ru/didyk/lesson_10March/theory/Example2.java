package ru.didyk.lesson_10March.theory;

public class Example2 {
	public static void main(String ... args) {
		String[][] a = {{"Hello", "World"}, {"a", "b", "c"}};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[1].length; j++) {
				System.out.println(a[j]);
			}
		}

	}
}
