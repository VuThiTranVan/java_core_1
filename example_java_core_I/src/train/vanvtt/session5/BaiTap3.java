package train.vanvtt.session5;

import java.util.Scanner;

public class BaiTap3 {
	// thuat toan sap xep:
	// https://medium.com/tuanbinhblog/8-thu%E1%BA%ADt-to%C3%A1n-s%E1%BA%AFp-x%E1%BA%BFp-ph%E1%BB%95-bi%E1%BA%BFn-trong-java-2c39de4272ce

	public static void main(String[] args) {
		int[] ints = new int[5];

		nhapGiaTri(ints);
		hienThi(ints);

		sapXepArr(ints);

		hienThi(ints);
		//
		System.out.println("*******");
		ints = sapXepArr(ints);
		hienThi(ints);

	}

	public static void hienThi(int[] arr) {
		System.out.println("Gia tri cua mang:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

	public static void nhapGiaTri(int[] arr) {
		System.out.println("Nhap gia tri cho arr tu ban phim:");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap gia tri cho index " + i);
			arr[i] = sc.nextInt();
		}
		System.out.println("=====\n");
	}

	public static int[] sapXepArr(int[] arr) {
		System.out.println("\n\t====Sap xep:");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// int temp = arr[j];
					// arr[j] = arr[j + 1];
					// arr[j + 1] = temp;

					hoanDoiGiaTri(arr, j, j + 1);
				}
			}
		}

		return arr;
	}

	public static void hoanDoiGiaTri(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
