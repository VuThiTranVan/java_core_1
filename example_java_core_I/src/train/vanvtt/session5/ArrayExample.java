package train.vanvtt.session5;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {

		int[] arr = new int[4];
		int[] arr1 = { 12, 2, 4, 6 };

		float[] arr2 = {};

		// hien thi toan bo array
		/*
		 * System.out.println("\tarrs"); for (int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i]); }
		 */

		System.out.println("\tarr1s");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		/*
		 * System.out.println("\tarr2s"); for (int i = 0; i < arr2.length; i++)
		 * { System.out.println(arr2[i]); }
		 */

		// System.out.println("\n\t arr1[6]: " + arr1[6]);

		System.out.println("thay doi gia tri cho arr ");
		System.out.println("\tarr1s");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nhap gia tri cho index " + i);
			arr[i] = sc.nextInt();
		}

		System.out.println("\tgia tri sau khi thay doi:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
