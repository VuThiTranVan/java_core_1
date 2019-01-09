package train.vanvtt.session4.enums;

public enum AbbreviationOfDays {
	/**
	 * Khởi tạo giá trị đặc biệt cho enum
	 *    Mặc định giá trị của enum sẽ bắt đầu là: 0, 1, 2, ...
	 *    Nhưng chúng ta có thể khởi tạo giá trị cụ thể cho các hằng số này bằng cách định nghĩa các fiels và constructor
	 *    
	 * Constructor của enum trong java là private
	 * Các phần tử trong enum luôn là static final.
	 */
	MONDAY("MON"), TUESDAY("TUES"), WEDNESDAY("WEB"), THURSDAY("THURS"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");
	private String abbreviation;

	public String getAbbreviation() {
		return this.abbreviation;
	}

	AbbreviationOfDays(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	 // Có thể viết một static method lấy ra WeekDay theo value.
    public static AbbreviationOfDays getWeekDayByValue(String value) {
        for (AbbreviationOfDays d : AbbreviationOfDays.values()) {
            if (d.abbreviation.equals(value)) {
                return d;
            }
        }
        return null;
    }
    
    /**
     *  Ghi đè phương thức trong Enum
     *  enum cũng là một kiểu dữ liệu được kết thừa từ lớp Object, nên chúng ta có thể ghi đè method toString() của lớp Object.
     */
    @Override
    public String toString() {
        if (abbreviation.equals("SUN") || abbreviation.equals("SAT")) {
            return "Today is holiday";
        } else {
            return "Today is working day";
        }
    }
    
    /*
     * Other:
     *    - Có thể ghi một method abstract trong enum
     *    - Có thể implement interface
     */
}
