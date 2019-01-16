package train.vanvtt.session6.practice;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
	private int canh2;

	@Override
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap thong tin Hinh Chu nhat:");
		this.canh = sc.nextInt();
		this.canh2 = sc.nextInt();

	}

	@Override
	public void hienThiThongTin() {
		System.out.println("\n===\nHien thi thong tin:");
		System.out.println("Canh dai: " + this.canh + "; \tCanh rong: " + this.canh2);
		System.out.println("Dien tich: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());

	}

	@Override
	public float tinhDienTich() {
		return this.canh * this.canh2;
		// return super.canh * this.canh2;
	}

	@Override
	public int tinhChuVi() {
		return (this.canh + this.canh2) * 2;
	}

	public int getCanh2() {
		return canh2;
	}

	public void setCanh2(int canh2) {
		this.canh2 = canh2;
	}

}
