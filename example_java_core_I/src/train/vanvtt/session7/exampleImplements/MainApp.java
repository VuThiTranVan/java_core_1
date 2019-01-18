package train.vanvtt.session7.exampleImplements;

public class MainApp {

	public static void main(String[] args) {
		AClass2 class2 = new AClass2() {
		};
		class2.canFly();
		class2.canRun();

		System.out.println("\n");
		Class11 class11 = new Class11();
		class11.canFly();
		class11.canRun();

		System.out.println("\n\n");
		IRunExample iexample1 = new AClass2() {

		};
		iexample1.canFly();
		iexample1.canRun();

		System.out.println("\n");
		IRunExample iexample2 = new Class11();
		iexample2.canFly();
		iexample2.canRun();

		System.out.println("\n\n");
		AClass2 class21 = new Class2ExtendAclass2();
		class21.canFly();
		class21.canRun();

		System.out.println("\n\n");
		AClass2 class22 = new Class3ExtendAclass2();
		class22.canFly();
		class22.canRun();
	}

}
