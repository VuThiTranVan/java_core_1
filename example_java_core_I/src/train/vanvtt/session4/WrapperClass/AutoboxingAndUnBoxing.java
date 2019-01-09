package train.vanvtt.session4.WrapperClass;

public class AutoboxingAndUnBoxing {

	/**
	 * Việc chuyển đổi một kiểu nguyên thủy sang kiểu Wrapper của nó người ta
	 * gọi là Boxing.
	 * 
	 * Boxing ở đây mang ý nghĩa là đóng hộp, tức là đóng dữ liệu nguyên thủy
	 * vào trong cái hộp Wrapper của nó đấy
	 * 
	 */
	public static void main(String[] args) {
		int num = 1;
		Integer obj1 = new Integer(num);// Boxing - thông qua các phương thức
										// khởi tạo
		Integer obj2 = 2; // Boxing - gán trực tiếp các giá trị nguyên thủy vào
							// cho các class wrapper

		int num1 = obj1; // unboxing

		int a = 500;
		Integer i = a; // Autoboxing
		int i2 = i.intValue(); // Unboxing

		/**
		 * 
		 * Một số method hữu ích của Class Wrapper
		 * 
		 */
		// -parseXxx(): Tham số truyền vào cho phương thức static này là một
		// chuỗi, kết quả nhận được là một giá trị nguyên thủy tương ứng với
		// chuỗi truyền vào.

		int par = Integer.parseInt("10");
		System.out.println(par);

		// toString():
		// Khác với toString() của lớp Object, toString() lần này của các lớp Wrapper là phương thức static,
		// nó có một giá trị truyền vào là kiểu dữ liệu nguyên thủy tương ứng với lớp Wrapper đó,
		// và kết quả trả về là một chuỗi tương ứng với giá trị truyền vào.		
		String sI = Integer.toString(10);
		System.out.println(sI);
		
		// Ngoài ra:
		// xxxValue(): chuyển một giá trị của Wrapper thành nguyên thủy (unboxing)
		// compareTo(): dùng để so sánh các giá trị chuỗi với nhau
		// (static) compare()
		// equals(): So sánh chuỗi
		
		Integer cti = 50;
		Integer cti1 = Integer.parseInt("50");
		Integer cti2 = Integer.valueOf(52);
		Integer cti3 = 30;		         
		System.out.println("CompareTo cti & cti1: " + cti.compareTo(cti1));
		System.out.println("CompareTo cti & cti2: " + cti.compareTo(cti2));
		System.out.println("CompareTo cti & cti3: " + cti.compareTo(cti3));
		
		Integer ci1 = Integer.parseInt("50");
		Integer ci2 = Integer.valueOf(52);		         
		System.out.println("Compare ci1 & ci2: " + Integer.compare(ci1, ci2));
	}

}
