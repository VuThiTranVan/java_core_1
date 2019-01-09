package train.vanvtt.session4.enums;

public class EnumTest {
	DAY day;

	public EnumTest(DAY day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {

		// hiển thị enum
		DAY day = DAY.SUNDAY;
		System.out.println("DAY enum is set a value: " + day);
		System.out.println("index: " + day.ordinal());
//
//		// call method
//		EnumTest seventhDay = new EnumTest(DAY.SUNDAY);
//		seventhDay.tellItLikeItIs();
//
//		// For with enum
//		// Duyệt và hiển thị toàn bộ phần tử trong Enum
//		for (DAY item : DAY.values()) {
//			System.out.println(item.toString());
//		}
	}

}
