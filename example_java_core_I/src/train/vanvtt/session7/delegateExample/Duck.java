package train.vanvtt.session7.delegateExample;

public class Duck implements CanSwim {
	private CanSwim swim;

	// ủy quyền
	public void canSwim() {
		swim.canSwim();
	}

	public static void main(String[] a) {

		Duck t = new Duck();

		t.swim = new CanSwim() {
			@Override
			public void canSwim() {
				System.out.println("Tui là vịt, việc của tui là bơi (hoho)");
			}
		};
		t.canSwim();
	}
}
