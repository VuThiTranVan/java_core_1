package train.vanvtt.session7.multipleInterface;

public class MultInterfaces implements I1, I2 {
	public void test(int i) {
		System.out.println("In MultInterfaces.I1.test");
	}

	public void test(String s) {
		System.out.println("In MultInterfaces.I2.test");
	}

	public static void main(String[] a) {
		MultInterfaces t = new MultInterfaces();
		t.test(1);
		t.test("Hello");
	}

}
