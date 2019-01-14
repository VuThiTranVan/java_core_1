package train.vanvtt.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();

		ints.add(10);
		ints.add(1);

		System.out.println("\nUsing for ");
		for (int i = 0; i < ints.size(); i++) {
			System.out.println(i + ": " + ints.get(i));
		}

		System.out.println("\nUsing foreach ");
		for (Integer item : ints) {
			System.out.println(item);
		}

		System.out.println("\n\t====");
		ArrayList<Object> arr = new ArrayList<>();
		arr.add("sv_01");
		arr.add("van");
		arr.add(11);

		for (Object object : arr) {
			System.out.println(object);
		}

		System.out.println("nhap gia tri cho Array list:");
		Scanner sc = new Scanner(System.in);

		int flag = 1;
		while (flag == 1) {
			System.out.println("Nhap gia tri: ");
			arr.add(sc.nextLine());

			System.out.println("ban co muon tieo tuc ko? co - 1; khong - 0");
			flag = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("Hien thi gia tri mang vua nhap:");
		for (Object object : arr) {
			System.out.println(object);
		}

	}

}
