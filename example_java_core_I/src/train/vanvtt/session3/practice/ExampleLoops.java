package train.vanvtt.session3.practice;

import java.util.Scanner;

public class ExampleLoops {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();
		exampleForNested(num);
		// exampleFor(num);
		// System.out.println("\n====");
		// exampleWhile(num);
		// System.out.println("\n====");
		// exampleDoWhile(num);
		//
		// System.out.println("\n====");
		// exampleForEach();
	}

	public static void exampleForNested(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("i = ");
			System.out.println(i);

			for (int j = 0; j < 3; j++) {
				System.out.print("j = ");
				System.out.println(j);
			}
			System.out.println("\nnested for");
		}
	}

	public static void exampleFor(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("i = ");
			System.out.println(i);
		}
	}

	public static void exampleWhile(int num) {
		int i = 0;
		while (i < num) {
			System.out.print("i = ");
			System.out.println(i);
			i++;
		}
	}

	public static void exampleDoWhile(int num) {
		int i = 0;
		do {
			System.out.print("i = ");
			System.out.println(i);
			i++;
		} while (i < num);
	}

	public static void exampleForEach() {

		String[] strs = { "1", "sfhdf", "dfdf" };
		for (String item : strs) {
			System.out.println(item);
		}
	}
}
