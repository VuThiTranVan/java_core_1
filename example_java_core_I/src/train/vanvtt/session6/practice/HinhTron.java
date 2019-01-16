package train.vanvtt.session6.practice;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
	final float PI = 3.14f;

	public HinhTron() {

	}

	public HinhTron(int canh) {
		super(canh);
	}

	@Override
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap thong tin Hinh tron:");
		super.canh = sc.nextInt();
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("\n===\nHien thi thong tin:");
		System.out.println("Ban kinh: " + super.canh);
		System.out.println("Dien tich: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());

	}

	@Override
	public float tinhDienTich() {
		return PI * super.canh * super.canh;
	}

	@Override
	public int tinhChuVi() {
		return (int) (2 * PI * super.canh);
	}

}
