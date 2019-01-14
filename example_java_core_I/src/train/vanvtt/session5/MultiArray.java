package train.vanvtt.session5;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		int[][] ints = new int[2][5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ints.length; i++) {
			System.out.println("Vong lap " + i);
			for (int j = 0; j < ints[i].length; j++) {

				System.out.println("nhap gia tri: [" + i + "][" + j + "]");
				ints[i][j] = sc.nextInt();
			}
		}
		
		
		hienThi(ints);

	}

	public static void hienThi(int[][] arr) {
		System.out.println("\nGia tri cua mang:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Vong lap " + i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("[" + i + "][" + j + "]: " + arr[i][j]);
			}
		}
	}

	public static void hienThi(int[] arr) {
		System.out.println("Gia tri cua mang:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

}
