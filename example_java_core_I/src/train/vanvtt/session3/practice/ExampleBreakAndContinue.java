package train.vanvtt.session3.practice;

import java.util.Scanner;

public class ExampleBreakAndContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();

		exampleFor(num);

		System.out.println("\n===");
		exampleForBreak(num);

		System.out.println("\n===");
		exampleForContinue(num);

	}

	public static void exampleFor(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("*");
			System.out.print("i = ");
			System.out.println(i);
		}
	}

	public static void exampleForBreak(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("*");
			if (i % 2 == 0) {
				System.out.println("i la so chan");
				break;
			}

			System.out.print("i = ");
			System.out.println(i);
		}
	}

	public static void exampleForContinue(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("*");

			if (i % 2 == 0) {
				System.out.println("i la so chan");
				continue;
			}

			System.out.print("i = ");
			System.out.println(i);
		}
	}

}
