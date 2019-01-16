package train.vanvtt.session5.inheritance;

public class RunTestDev {
	public static void main(String[] args) {
		Dev dev1 = new Dev("van", "01", "java + ruby");
		dev1.xuatThongTin();

		System.out.println("\n====");
		NhanVien nv = new NhanVien();
		nv.xuatThongTin();

		System.out.println("\n====");
		NhanVien nv1 = new Dev("ten", "01", "Java");
		nv1.xuatThongTin();

		System.out.println("\n====");
		NhanVien nv2 = new QA(false, "QA", "QA_01");
		nv2.xuatThongTin();

	}

}
