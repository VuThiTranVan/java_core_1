package train.vanvtt.buoi1.ScannerAndSystem;

import java.util.Scanner;

/**
 * 
 * @author FRAMGIA\vu.thi.tran.van
 * 
 *         java.util.Scanner: dùng để nhập và xuất dữ liệu từ bàn phím
 * 
 *         Note: Sự khác nhau giữa next() và nextLine() trong scanner
 *
 */
public class Example_Session1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// compareNextAndNextLine(input);

		problem_scanner_nextInt(input);
	}

	public static void compareNextAndNextLine(Scanner input) {
		// sử dụng nextLine() => trả về nội dung (kết quả) của một chuỗi đã nhập
		// vào
		System.out.println("Nhập vào họ và tên: ");
		String fullname1 = input.nextLine();
		System.out.println("Họ tên bạn vừa nhập vào sử dụng method nextLine: " + fullname1);

		// sử dụng next() => Trả về kết quả (nội dung) trước khoảng trắng
		System.out.println("Nhập vào họ và tên  : ");
		String fullname2 = input.next();
		System.out.println("Họ tên bạn vừa nhập vào sử dụng method next: " + fullname2);
	}

	/**
	 * Bài tập 1: Nhập vào đặc điểm người yêu tương lai của bạn
	 */

	/**
	 * Bài tập 2: Nhập vào 2 số bất kỳ, và in ra tổng của 2 số đó
	 */

	/**
	 * Bài tập 3: Nhập vào thông tin Sinh viên gồm: tên, năm sinh và quê quán
	 */

	/**
	 * Nâng cao: Trôi lệnh Scanner
	 *     Nguyên nhân: do khi các bạn nhập vào một số, sau đó nhấn  Enter thì lúc này,
	 *     			input.nextLine() vì nó là trả về là một chuỗi kiểu String nên sẽ nhận giá trị là ký tự Enter.
	 *     
	 *     Giải pháp
	 *        - Dùng nextLine() sau nextInt()
	 *        - Dùng IntegerParseInt()
	 *        - Dùng Integer.valueOf()
	 */
	// Problem: giá trị của thông tin quê quán ko được nhập vào
	public static void problem_scanner_nextInt(Scanner input) {
		System.out.println("Nhập vào họ tên: ");
		String hoten = input.nextLine();

		System.out.println("Nhập vào năm sinh: ");
		int namSinh = input.nextInt();

		System.out.println("Nhập vào quê quán: ");
		String queQuan = input.nextLine();
		System.out.println(">> THÔNG TIN SINH VIÊN");
		System.out.println("Họ tên : " + hoten);
		System.out.println("năm sinh : " + namSinh);
		System.out.println("Tên lớp : " + queQuan);
	}
	
	// Solve
	public static void solve1(Scanner input) {
		System.out.println("Nhập vào họ tên: ");
		String hoten = input.nextLine();

		System.out.println("Nhập vào năm sinh: ");
		int namSinh = input.nextInt();
		input.nextLine();
		System.out.println("Nhập vào quê quán: ");
		String queQuan = input.nextLine();
		System.out.println(">> THÔNG TIN SINH VIÊN");
		System.out.println("Họ tên : " + hoten);
		System.out.println("năm sinh : " + namSinh);
		System.out.println("Tên lớp : " + queQuan);
	}
	
	public static void solve2(Scanner input) {
		System.out.println("Nhập vào họ tên: ");
		String hoten = input.nextLine();

		System.out.println("Nhập vào năm sinh: ");
		int namSinh = Integer.parseInt(input.nextLine());
		System.out.println("Nhập vào quê quán: ");
		String queQuan = input.nextLine();
		System.out.println(">> THÔNG TIN SINH VIÊN");
		System.out.println("Họ tên : " + hoten);
		System.out.println("năm sinh : " + namSinh);
		System.out.println("Tên lớp : " + queQuan);
	}
	
	public static void solve3(Scanner input) {
		System.out.println("Nhập vào họ tên: ");
		String hoten = input.nextLine();

		System.out.println("Nhập vào năm sinh: ");
		int namSinh = Integer.valueOf(input.nextLine());
		System.out.println("Nhập vào quê quán: ");
		String queQuan = input.nextLine();
		System.out.println(">> THÔNG TIN SINH VIÊN");
		System.out.println("Họ tên : " + hoten);
		System.out.println("năm sinh : " + namSinh);
		System.out.println("Tên lớp : " + queQuan);
	}
}
