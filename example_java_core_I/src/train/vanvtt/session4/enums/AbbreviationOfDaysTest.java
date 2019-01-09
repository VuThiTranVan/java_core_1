package train.vanvtt.session4.enums;

public class AbbreviationOfDaysTest {

	public static void main(String[] args) {
		AbbreviationOfDays[] abbreviationOfDays = AbbreviationOfDays.values();
		for (AbbreviationOfDays day : abbreviationOfDays) {
			System.out.println(day.getAbbreviation().toString());
		}

		AbbreviationOfDays today = AbbreviationOfDays.TUESDAY;
		System.out.println(today);
		System.out.println(today.toString());

		System.out.println(today.getAbbreviation().toString());

		System.out.println("====");
		DAY day = DAY.TUESDAY;
		System.out.println("DAY enum is set a value: " + day);
		System.out.println("index: " + day.ordinal());
	}

}
