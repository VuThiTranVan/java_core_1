package train.vanvtt.session4.WrapperClass.practice;

public class VariableExample {
	static int i = 10; // class varirable

	int i2 = 2;

	public void method1() {
		int i3 = 3; // local variable
		System.out.println(i3);
	}

	public static void main(String[] args) {
		System.out.println(VariableExample.i);

		VariableExample obj = new VariableExample();
		System.out.println(obj.i2);// instance variable

		VariableExample obj1 = new VariableExample();
		System.out.println(obj1.i2);// instance variable

		System.out.println("===");
		System.out.println(obj.i);
		System.out.println(obj1.i);
		
		
		// 
		System.out.println("===");
		obj1.i2 = 20;
		System.out.println(obj.i2);
		System.out.println(obj1.i2);
		
		//

		System.out.println("===");
		VariableExample.i = 300;
		System.out.println(obj.i);
		System.out.println(obj1.i);

	}

}
