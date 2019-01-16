package train.vanvtt.session6.practice;

import java.util.Scanner;

public class RunTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HinhHoc hinhHoc = new HinhTron();
		hinhHoc.nhapThongTin(sc);
		hinhHoc.hienThiThongTin();

		System.out.println("\n=====");
		HinhTron hinhTron = new HinhTron();
		hinhTron.nhapThongTin(sc);
		hinhTron.hienThiThongTin();

	}

}
