package ru.didyk.lesson_10March.theory;

public class Example1 {
	public static void main(String ... args) {
		int[] x = {1, 2, 3, 10, 11, 20, 33, 44, 55};

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			if(x[i] % 2 == 0) {
				System.out.println(x[i]);
			}
		}
		sum = sum/x.length;
		System.out.println("Average number: " + sum);

		// посчитайте среднее арифметическое

		// распечатайте все четные элементы


	}
}
