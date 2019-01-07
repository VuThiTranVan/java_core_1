package train.vanvtt.session3.practice;

import java.util.Scanner;

public class ExampleSwithCase {

	public static void main(String[] args) {
		hienThiThuTuBanPhim();
	}

	public static void hienThiThuTuBanPhim() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so: ");
		int num = sc.nextInt();

		switch (num) {
		case 2:
			System.out.println("Thu hai");
//			break;
		case 3:
			System.out.println("Thu ba");
//			break;
		case 4:
			System.out.println("Thu tu");
			break;
		case 5:
			System.out.println("Thu nam");
			break;
		case 6:
			System.out.println("Thu sau");
			break;
		case 7:
			System.out.println("Thu bay");
			break;
		case 8:
			System.out.println("Chu Nhat");
			break;
		default:
			System.out.println("Opp! loi roi!!");
			break;
		}
		
		System.out.println("done switch - case");
	}
}
