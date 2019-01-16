package train.vanvtt.session5.inheritance;

public class Dev extends NhanVien {
	private String ngonNgu;

	public Dev(String ten, String maNV, String ngonNgu) {
		super(ten, maNV);
		this.ngonNgu = ngonNgu;
	}

	// public Dev(String ten, String maNV, String ngonNgu) {
	// this.ten = ten;
	// this.maNV = maNV;
	// this.ngonNgu = ngonNgu;
	// }

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	@Override
	protected String boPhan() {
		return "Lam viec tai bo phan Phát triển";
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Ngon ngu: " + ngonNgu);
	}
}
