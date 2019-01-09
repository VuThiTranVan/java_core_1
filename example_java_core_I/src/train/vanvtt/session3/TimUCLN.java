package train.vanvtt.session3;

import java.util.Scanner;

public class TimUCLN {
	/*
	 * USCLN của 2 số nguyên dương a và b là một số k lớn nhất, sao cho a và b
	 * đều chia hết cho k.
	 */
	public static void main(String[] args) {
		int firstNumber, secondNumber, temp1, temp2, uscln;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số thứ nhất: ");
		firstNumber = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		secondNumber = scanner.nextInt();

		// kiem tra viec 2 so nhap vao phai duong, neu ko yeu cau nhap lai
		while ((firstNumber <= 0) || (secondNumber <= 0)) {
			System.out.println("Nhập lại hai số nguyên dương!");
			System.out.println("Nhập vào số thứ nhất: ");
			firstNumber = scanner.nextInt();
			System.out.println("Nhập vào số thứ hai: ");
			secondNumber = scanner.nextInt();
		}

		// tìm ước số chung lớn nhất
		temp1 = firstNumber;
		temp2 = secondNumber;
		while (temp1 != temp2) {
			if (temp1 > temp2) {
				temp1 -= temp2;
			} else {
				temp2 -= temp1;
			}
		}
		uscln = temp1;

		System.out.println("Ước số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " + uscln);
	}
}
