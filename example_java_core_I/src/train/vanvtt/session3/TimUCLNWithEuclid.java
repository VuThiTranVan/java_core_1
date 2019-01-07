package train.vanvtt.session3;

import java.util.Scanner;

public class TimUCLNWithEuclid {

	/*
	 * Giải thuật Euclid giả sử a lớn hơn b, khi đó việc tính UCSLN của a và b
	 * sẽ được đưa về bài toán tính USCLN của a mod b và b vì USCLN(a, b) =
	 * USCLN(a mod b, b).
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên dương a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập số nguyên dương b = ");
		int b = scanner.nextInt();
		// tính USCLN của a và b
		System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));

	}

	/**
	 * Tìm ước số chung lớn nhất (USCLN)
	 * 
	 * @param a: số nguyên dương
	 * @param b: số nguyên dương
	 * @return USCLN của a và b
	 */
	public static int USCLN(int a, int b) {
		if (b == 0)
			return a;
		return USCLN(b, a % b);
	}

}
