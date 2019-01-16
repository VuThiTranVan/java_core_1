package train.vanvtt.session6.abstractExample;

public abstract class ANhanVien {
	protected String ten;
	protected String maNV;
/*
	public ANhanVien() {
	}*/

	public ANhanVien(String ten, String maNV) {
		this.ten = ten;
		this.maNV = maNV;
	}

	public abstract String myClass();
	
	public String boPhan() {
		return "Chua xac dinh bo phan lam viec";
	}

	public void xuatThongTin() {
		System.out.println("===== Nhân viên =====");
		System.out.println("- Mã nhân viên: " + maNV);
		System.out.println("- Tên: " + ten);
		System.out.println("- Loại nhân viên: " + boPhan());
	}
}
