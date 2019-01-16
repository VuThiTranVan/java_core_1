package train.vanvtt.session6.practice;

import java.util.Scanner;

public abstract class HinhHoc {
	protected int canh;

	public HinhHoc() {

	}

	public HinhHoc(int canh) {
		this.canh = canh;
	}

	public abstract void nhapThongTin(Scanner sc);

	public abstract void hienThiThongTin();

	public abstract float tinhDienTich();

	public abstract int tinhChuVi();

}
