package train.vanvtt.session6.practice;

import java.util.Scanner;

public class HinhVuong extends HinhHoc {

	@Override
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap thong tin Hinh Vuong:");
		super.canh = sc.nextInt();
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("\n===\nHien thi thong tin:");
		System.out.println("Canh: " + super.canh);
		System.out.println("Dien tich: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
	}

	@Override
	public float tinhDienTich() {
		return super.canh * super.canh;
	}

	@Override
	public int tinhChuVi() {
		return (super.canh + super.canh) * 2;
	}

}
