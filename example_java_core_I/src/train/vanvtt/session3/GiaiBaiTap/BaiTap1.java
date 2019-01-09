package train.vanvtt.session3.GiaiBaiTap;

public class BaiTap1 {

	public static void main(String[] args) {
		// Tình tổng các số chẳn từ 1 -20, sau đó in ra màn hình

		int sum = 0;

		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

			i++;
		}

		System.out.println("Tong cac so chan tu 1 - 20: " + String.valueOf(sum));

		sum = 0;
		for (int j = 1; j <= 20; j++) {
			if (j % 2 == 0) {
				sum = sum + j;
			}
		}
		System.out.println("Tong cac so chan tu 1 - 20: " + String.valueOf(sum));

	}

}
