package train.vanvtt.session5;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {

		// Khai báo một mảng 5 phần tử kiểu nguyên thủy (primitive)
		int[] arr = { 15, 5, 10, 30, 25 };
		System.out.println("Gọi hàm toString để hiển thị mảng: ");
		// Chuyển một mảng thành chuỗi (string)
		System.out.println(Arrays.toString(arr));

		// Sắp xếp các giá trị của mảng tăng dần
		Arrays.sort(arr);

		System.out.println("Sau khi gọi hàm sort: ");
		// Chuyển một mảng thành chuỗi (string)
		System.out.println(Arrays.toString(arr));

		// Tìm kiếm chỉ số của một giá trị xuất hiện trong mảng.
		// Mảng phải được sắp xếp trước khi gọi hàm binarySearch
		int index = Arrays.binarySearch(arr, 30);
		if (index < 0) {
			System.out.println("Không tìm thấy giá trị");
		} else {
			System.out.println("Tìm thấy giá trị 30 tại index  " + index);
		}

		// Gán cùng một giá trị cho tất cả các phần tử của mảng.
		Arrays.fill(arr, 11);

		System.out.println("Sau khi gọi hàm fill: ");
		// Chuyển một mảng thành chuỗi (string)
		System.out.println(Arrays.toString(arr));

		// Khai báo một mảng 5 phần tử kiểu đối tượng (object)
		Integer[] arr2 = { 15, 5, 10, 30, 25 };

		// Chuyển một mảng có kiểu T sang danh sách (List) có kiểu T
		// List: chỉ sử dụng được với object, không sử dụng kiểu nguyên thủy
		// (primitive)
		List<Integer> list = Arrays.asList(arr2);

		System.out.println("Sau khi gọi hàm asList: ");
		
		// Chuyển một mảng thành chuỗi (string)
		System.out.println(list);
	}
}
