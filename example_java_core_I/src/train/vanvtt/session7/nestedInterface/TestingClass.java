package train.vanvtt.session7.nestedInterface;

public class TestingClass implements TestClass.TestIn {

	@Override
	public void show() {
		System.out.println("Show method of interface into TestingClass");
		
	}

}
