package train.vanvtt.session3.practice;

import java.util.Scanner;

public class ExampleIfStatement {

	public String hienThiXinChao() {
		System.out.println("tesst");
		return "xin chao!";
	}

	public void hienThiXinChao1() {
		System.out.println("tesst");
		System.out.println("tesst");
		System.out.println("tesst");
	}

	public static void testIfElseWithReturn(boolean flag) {
		if (flag) {
			System.out.println("code if");
			return;
		} else {
			System.out.println("code else");
		}
		System.out.println("ben ngoai phan else if");
	}

	public static void testIfWithReturn(boolean flag) {
		// if (flag) {
		// System.out.println("code if");
		// return;
		// } else {
		// System.out.println("code else");
		// }

		if (flag) {
			System.out.println("code if");
			return;
		}
		System.out.println("code else");
	}

	public static void hienThiThuTuBanPhim() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();

		if (num == 2) {
			System.out.println("Thu hai");
		} else if (num == 3) {
			System.out.println("Thu ba");
		} else if (num == 4) {
			System.out.println("Thu tu");
		} else if (num == 5) {
			System.out.println("Thu nam");
		} else if (num == 6) {
			System.out.println("Thu sau");
		} else if (num == 7) {
			System.out.println("Thu bay");
		} else if (num == 8) {
			System.out.println("chu nhat");
		} else {
			System.out.println("Opp! Nhap sai oy");
		}
	}

	public static void hienThiThuTuBanPhim_ToiUuHon() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();

		if (num < 2 || num > 8) {
			System.out.println("Opp! Nhap sai oy");
			return;
		}

		if (num == 2) {
			System.out.println("Thu hai");
			return;
		}

		if (num == 3) {
			System.out.println("Thu ba");
			return;
		}

		if (num == 4) {
			System.out.println("Thu tu");
			return;
		}

		if (num == 5) {
			System.out.println("Thu nam");
			return;
		}

		if (num == 6) {
			System.out.println("Thu sau");
			return;
		}

		if (num == 7) {
			System.out.println("Thu bay");
			return;
		}

		// if (num == 8) {
		System.out.println("chu nhat");
		// return;
		// }
		/*
		 * else if (num == 8) { System.out.println("chu nhat"); }
		 */

		/*
		 * else { System.out.println("Opp! Nhap sai oy"); }
		 */

		System.out.println("\n======\n");
		if (num == 2) {
			System.out.println("Thu hai");
		} else if (num == 3) {
			System.out.println("Thu ba");
		} else if (num == 4) {
			System.out.println("Thu tu");
		} else if (num == 5) {
			System.out.println("Thu nam");
		} else if (num == 6) {
			System.out.println("Thu sau");
		} else if (num == 7) {
			System.out.println("Thu bay");
		} else {
			System.out.println("chu nhat");
		}

	}

	public static void nestedIf() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(" la so chan");

			// code C2
			if (num > 3) {
				// C2BT
				System.out.println("num lon hon 3");
			} else {
				// C2BF
				System.out.println("num nho hon 3");
			}
		} else {
			System.out.println("Day la so le");

			if (num > 3) {
				System.out.println("num lon hon 3");
			} else {
				System.out.println("num nho hon 3");
			}
		}

		System.out.println("Day la code B1");
	}

	// Multi conditions
	public static void multiCondition() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();

		System.out.println("num : " + String.valueOf(num));

		if (num % 2 == 0 && num > 10) {
			System.out.println("\tLa so chan - va lon hon 10");
			return;
		}
		if (num < 10) {
			System.out.println("\tLa so le - va nho hon 10");
		}
	}

	public static void cauDieuKienNgoiSo3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();
		String flag;

		flag = (num % 2 == 0) ? "so chan" : "so le";
		System.out.println(flag);
		System.out.println();
		System.out.println((num % 2 == 0) ? "so chan" : "so le");
	}

	public static void main(String args[]) {
		cauDieuKienNgoiSo3();
		// multiCondition();

		// nestedIf();

		// hienThiThuTuBanPhim();
		// hienThiThuTuBanPhim_ToiUuHon();

		/*
		 * testIfElseWithReturn(true); System.out.println("\n====\n");
		 * testIfElseWithReturn(false);
		 * 
		 * System.out.println("\n==testIfWithReturn==\n");
		 * testIfWithReturn(true); System.out.println("\n====");
		 * testIfWithReturn(false);
		 */
	}
}
