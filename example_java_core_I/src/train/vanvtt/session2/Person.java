package train.vanvtt.session2;

public class Person {
	private String name;
	private int age;
	private String gender;

	public Person() {

	}

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.canSpeakEnglish(true));
		System.out.println(person.canSpeakEnglish(false));
		System.out.println(person.canSpeakEnglish(false, 1));
		System.out.println(person.canSpeakEnglish(false, "szf"));

		System.out.println(person.canSpeakEnglish(false, "szf"));

	}

	public String canSpeakEnglish(boolean isSpeak) {
		System.out.println("\n\t1 -  1 tham so boolean");
		if (isSpeak) {
			return " i can speak english";
		}
		return "I can't speak english";
	}

	public String canSpeakEnglish(boolean isSpeak, int a) {

		System.out.println("\n\t2-  1 tham so boolean + int");
		if (isSpeak) {
			return " i can speak english";
		}
		return "I can't speak english";
	}

	public String canSpeakEnglish(boolean isSpeak, String a) {

		System.out.println("\n\t3 - 1 tham so boolean+ String");
		if (isSpeak) {
			return " i can speak english";
		}
		return "I can't speak english";

	}

	public void hello() {
		System.out.println("\n\n HELLO");
		staticHello();

	}

	public static void staticHello() {
		System.out.println("\n\n Hi");
		// hello(); loi vi day la instance method

	}

}
