package train.vanvtt.session4.practices;

import java.util.Scanner;

public class TinhDienTichHinhTron {

	final static float PI = 3.14f;
	int r;

	public void nhapBanKinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron: ");
		this.r = sc.nextInt();

		while (this.r < 0) {
			System.out.println("\nBan kinh khong duoc la so am!!");
			System.out.println("Nhap ban kinh hinh tron: ");
			this.r = sc.nextInt();
		}

	}

	public void hienThiDienTich() {
		float s = this.r * this.r * PI;
		System.out.println("Dien tich: " + s);
	}

	public static void main(String[] args) {
		TinhDienTichHinhTron ht = new TinhDienTichHinhTron();
		ht.nhapBanKinh();
		ht.hienThiDienTich();

	}

}
