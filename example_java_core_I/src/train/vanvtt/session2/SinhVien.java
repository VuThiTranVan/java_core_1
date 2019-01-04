package train.vanvtt.session2;

import java.util.Scanner;

public class SinhVien {
	/*
	 * tên, tuổi, giới tính, quê quán
	 */
	// properties
	private String ten;
	private int tuoi;
	private String gioiTinh;
	private String queQuan;

	// constructor
	public SinhVien() {

	}

	public SinhVien(String ten, int tuoi, String gioiTinh, String queQuan) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
	}

	// method nhập thông tin và hiển thị thông tin
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten:");
		String ten = sc.nextLine();
		setTen(ten);

		System.out.println("Nhap tuoi: ");
		int tuoi = sc.nextInt();
		sc.nextLine();
		setTuoi(tuoi);

		System.out.println("Nhap gioi tinh: ");
		String gioiTinh = sc.nextLine();
		setGioiTinh(gioiTinh);

		System.out.println("Nhap que quan: ");
		String queQuan = sc.nextLine();
		setQueQuan(queQuan);
	}

	// hien thi thong tin
	// instance method
	public void hienThiThongTin() {
		System.out.println("method khong tham so:");
		System.out.println("Ten: " + getTen());
		System.out.println("Tuoi: " + getTuoi());
		System.out.println("Gioi tinh: " + getGioiTinh());
		System.out.println("Que quan: " + getQueQuan());
	}

	public void hienThiThongTin(SinhVien sv) {
		System.out.println("method khong tham so:");
		System.out.println("Ten: " + sv.getTen());
		System.out.println("Tuoi: " + sv.getTuoi());
		System.out.println("Gioi tinh: " + sv.getGioiTinh());
		System.out.println("Que quan: " + sv.getQueQuan());
	}

	// Cac methods de set / get cho private variable
	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTen() {
		return this.ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	/*
	 * Bài tập 2 2. Tạo method nhập thông tin với tham số là object tạo bởi
	 * class Sinh Viên. sử dụng method này hiển thị thông tin vừa nhập
	 */
	// method nhập thông tin và hiển thị thông tin
	public void nhapThongTin(SinhVien sv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten:");
		sv.setTen(sc.nextLine());
		// setTen(ten);

		System.out.println("Nhap tuoi: ");
		// int tuoi = sc.nextInt();
		sv.setTuoi(sc.nextInt());
		sc.nextLine();

		// setTuoi(tuoi);

		System.out.println("Nhap gioi tinh: ");
		// String gioiTinh = sc.nextLine();
		sv.setGioiTinh(sc.nextLine());
		// setGioiTinh(gioiTinh);

		System.out.println("Nhap que quan: ");
		// String queQuan = sc.nextLine();

		sv.setQueQuan(sc.nextLine());
		// setQueQuan(queQuan);
	}

	// Run application
	public static void main(String[] args) {
		/*
		 * SinhVien sv1 = new SinhVien(); sv1.nhapThongTin();
		 * 
		 * System.out.println("\n ======"); sv1.hienThiThongTin();
		 */

		System.out.println("\n === Bài tập 1 ===");
		// Bài tập 1:
		// Sử dụng constructor có tham số
		// Và hiển thị các giá trị đã truyền vào ở constructor đó
		SinhVien baiTap1 = new SinhVien("van", 26, "Nữ", "Quang Nam");
		baiTap1.hienThiThongTin();

		System.out.println("\n === Bài tập 2 ===");
		// Bai tap 2
		SinhVien baiTap2 = new SinhVien();
		baiTap2.nhapThongTin(baiTap2);
		baiTap2.hienThiThongTin();
	}

}
