package train.vanvtt.session5.inheritance;

public class QA extends NhanVien {
	private boolean isTestAutomation;

	public QA(boolean isTestAutomation, String ten, String maNV) {
		this.ten = ten;
		this.maNV = maNV;
		this.isTestAutomation = isTestAutomation;
	}

	public boolean isTestAutomation() {
		return isTestAutomation;
	}

	public void setTestAutomation(boolean isTestAutomation) {
		this.isTestAutomation = isTestAutomation;
	}
	
	@Override
	protected String boPhan() {
		return "Kiểm thử";
	}

}
