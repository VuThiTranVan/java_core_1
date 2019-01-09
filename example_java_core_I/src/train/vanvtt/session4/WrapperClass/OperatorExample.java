package train.vanvtt.session4.WrapperClass;

public class OperatorExample {
	public static void main(String[] args) {
		int a = 20;
		int b = 5;
		int c = 10;

		System.out.println("a + b * c   = " + (a + b * c));
		System.out.println("(a + b) * c = " + ((a + b) * c));
		System.out.println("a / b - c   = " + (a / b - c));
		System.out.println("a / (b - c) = " + (a / (b - c)));
	}
}
