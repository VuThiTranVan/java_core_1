package train.vanvtt.session3;

import java.util.Scanner;

public class TinhBinhPhuongSo {
	public static void main(String[] args) {
		int n, i = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số nguyên dương n: ");
		n = scanner.nextInt();

		while (n <= 0) {
			System.out.println("Nhập lại số nguyên dương n: ");
			n = scanner.nextInt();
		}

		System.out.println("Tổng = " + i * i);
	}
}
