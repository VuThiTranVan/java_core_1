package train.vanvtt.session6.abstractExample;

public class Developer extends ANhanVien {
	public Developer(String ten, String maNV) {
		super(ten, maNV);
	}

	public Developer(String ten, String maNV, String ngonNgu) {
		super(ten, maNV);
		this.ngonNgu = ngonNgu;
	}

	private String ngonNgu;

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	@Override
	public String myClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
