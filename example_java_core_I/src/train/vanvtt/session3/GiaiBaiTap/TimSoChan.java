package train.vanvtt.session3.GiaiBaiTap;

import java.util.Scanner;

public class TimSoChan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, j = 1;
/*		do {
			System.out.println("Nhap vao so bat ky: ");
			num = sc.nextInt();
			if (checkSoChan(num)) {
				System.out.println("So chan: " + String.valueOf(num));
				break;
			}
			
			j++;
		} while (j > 0);
		*/
		
		while (j > 0) {
			System.out.println("Nhap vao so bat ky: ");
			num = sc.nextInt();
			if (checkSoChan(num)) {
				System.out.println("So chan: " + String.valueOf(num));
				break;
			}
			
			j++;
		}
		System.out.println("ban da nhap sai : " + String.valueOf(j) + " lan");
	}

	public static boolean checkSoChan(int i) {
		if (i % 2 == 0)
			return true;
		return false;
	}

}
