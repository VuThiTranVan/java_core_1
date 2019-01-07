package train.vanvtt.session3;

import java.util.Scanner;

public class TimSoNguyenTo {

	/**
	 * Số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó. 2, 3, 5,
	 * 7, 11, 13, 17, … là những số nguyên tố. Số 0 và 1 không phải là số nguyên
	 * tố. Chỉ có số 2 là số nguyên tố chẵn, tất cả các số chẵn khác không phải
	 * là số nguyên tố vì chúng chia hết cho 2.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập n = ");
		int n = scanner.nextInt();
		System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
		if (n >= 2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i += 2) {
			if (isPrimeNumber(i)) {
				System.out.print(" " + i);
			}
		}

	}

	/**
	 * check so nguyen to
	 * 
	 * @param n:
	 *            so nguyen duong
	 * @return true la so nguyen so, false khong la so nguyen to
	 */
	public static boolean isPrimeNumber(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	// Other:
	/**
	 * Đếm n số nguyên tố đầu tiên
	 */
	public void countPrimeNumber() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập n = ");
		int n = scanner.nextInt();
		System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
		int dem = 0; // đếm số số nguyên tố
		int i = 2; // tìm số nguyên tố bắt dầu từ số 2
		while (dem < n) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
				dem++;
			}
			i++;
		}

	}

}
