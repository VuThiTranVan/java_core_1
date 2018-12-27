package train.vanvtt.pass_by_Value_Or_Reference;

public class Practice {

	int data = 50;

	void changeByValue(int data) {
		this.data = data + 100; // changes will be in the local variable only
	}

	void changeByReference(Practice pr) {
		pr.data = 500;// changes will be in the instance variable
	}

	void changeByReference_UsingObject(Practice pr) {

		Practice obj = new Practice();
		obj.data = 300;
		pr = obj;
	}

	public static void main(String args[]) {
		Practice practice = new Practice();
		System.out.println("before change " + practice.data);

		practice.changeByValue(500); // passing value
		System.out.println("after change " + practice.data);
		System.out.println("\n\t____________");

		
		// Using pass by reference
		Practice practice2 = new Practice();

		System.out.println("before change " + practice2.data);
		practice2.changeByReference(practice2); // passing object
		System.out.println("after change " + practice2.data);
		System.out.println("\n\t____________");

		
		// Using pass by reference
		Practice practice3 = new Practice();

		System.out.println("before change " + practice3.data);
		practice3.changeByReference_UsingObject(practice3);
		System.out.println("after change " + practice3.data);
	}

}
