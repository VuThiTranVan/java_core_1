package train.vanvtt.session4.practices;

import java.util.Scanner;

public class HinhChuNhat {
	int canhDai;
	int canhRong;

	// Nhập vào 2 số bất kỳ làm cạnh hình chữ nhật, kiểm tra nếu một trong 2 số
	// đó là số âm thì yêu cầu nhập lại
	public void nhapGiaTri2Canh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai");
		this.canhDai = sc.nextInt();

		System.out.println("Nhap canh rong");
		this.canhRong = sc.nextInt();
		System.out.println("====\n");
		while (this.canhRong < 0 || this.canhDai < 0) {
			System.out.println("\ncanh dai va canh rong deu phai la so nguyen duong!");
			System.out.println("Nhap chieu dai");
			this.canhDai = sc.nextInt();

			System.out.println("Nhap canh rong");
			this.canhRong = sc.nextInt();
		}
	}

	public void hienThiDienTich() {
		float s = this.canhRong * this.canhDai;
		System.out.println("Dien tich: " + s);
	}

	public void hienThiChuVi() {
		float c = (this.canhDai + this.canhRong) * 2;
		System.out.println("Chu vi: " + c);
	}

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.nhapGiaTri2Canh();
		hcn.hienThiDienTich();
		hcn.hienThiChuVi();

	}

}
