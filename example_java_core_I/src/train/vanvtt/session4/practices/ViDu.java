package train.vanvtt.session4.practices;

import java.util.Scanner;

public class ViDu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		do {
			System.out.println("Nhap vao so: ");
			int num = sc.nextInt();
			switch (num) {
			case 2:
				/*
				 * System.out.println("Hello"); break;
				 */
			case 3:
				System.out.println("Hello");
				break;
			case 4:
				/*
				 * System.out.println("hi!"); break;
				 */
			case 5:
				System.out.println("hi!");
				break;

			default:
				System.out.println("Hello world");
				break;
			}

			System.out.println("\n\nban co muon tiep tuc ko?\nCo: 1\t Khong: 0");
			flag = sc.nextInt();
		} while (flag == 1);

	}

}
