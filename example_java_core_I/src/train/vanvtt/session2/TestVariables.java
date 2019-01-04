package train.vanvtt.session2;

public class TestVariables {
	String a = "123";
	static String b = "1132";

	public static void main(String args[]) {
		TestVariables test = new TestVariables();
/*
		System.out.println("a = " + test.a);
		System.out.println("b = " + TestVariables.b);
		System.out.println("b = " + test.b);*/

		test.a = "adsfs";
		
		TestVariables test1 = new TestVariables();
		System.out.println("\na = " + test.a);
		System.out.println("a = " + test1.a);
		
		test.b = "cccccc";
		
		System.out.println("\n\nb = " + test.b);
		System.out.println("b = " + test1.b);
//
//		String a;
//		String abc = "1223";
//
//		abc = "hgfd";
//		System.out.println("'" + abc + "'");
//
//		a = "tesst";
//		System.out.println("'" + a + "'");
	}
}
