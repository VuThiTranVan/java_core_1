package train.vanvtt.session3;

public class ExampleUsingLabel {

	public static void main(String[] args) {
		exampleBreakAndLabel();
		exampleBreakNotLabel();

	}

	public void exampleBreak() {
		System.out.println("Break example");
		int x = 2;

		while (x < 15) {
			System.out.println("----------------------\n");
			System.out.println("x = " + x);

			// Kiểm tra nếu x = 5 thì thoát ra khỏi vòng lặp.
			if (x == 5) {
				break;
			}

			x++;
			System.out.println("x after ++ = " + x);
		}
		System.out.println("Done!");
	}

	public void exampleContinue() {
		System.out.println("Continue example");
		int x = 2;

		while (x < 15) {
			System.out.println("----------------------\n");
			System.out.println("x = " + x);
			// x = x + 1;
			x++;

			// Toán tử % là phép chia lấy số dư.
			// Nếu x chẵn, thì bỏ qua các dòng lệnh phía dưới của 'continue',
			// và tiếp tục bước lặp (iteration) mới (nếu điều kiện vẫn đúng).
			if (x % 2 == 0) {
				continue;
			}

			System.out.println("x after ++ = " + x);
		}
		System.out.println("Done!");
	}

	/**
	 * Label Loop
	 * 
	 * đặt tên cho một vòng lặp khi bạn sử dụng nhiều vòng lặp lồng nhau trong
	 * một chương trình. Sử dụng lệnh break labelX; để break vòng lặp được dán
	 * nhãn labelX. Sử dụng lệnh continue labelX; để continue vòng lặp được dán
	 * nhãn labelX.
	 */

	public static void exampleBreakAndLabel() {
		System.out.println("Labelled Loop Break example");

		int i = 0;

		label1: while (i < 5) {
			System.out.println("----------------------\n");
			System.out.println("i = " + i);
			i++;

			label2: for (int j = 0; j < 3; j++) {
				System.out.println("  --> j = " + j);
				if (j > 0) {
					// Thoát khỏi vòng lặp có nhãn label1.
					break label1;
				}
			}
		}

		System.out.println("Done!");
	}
	
	public static void exampleBreakNotLabel() {
		System.out.println("Labelled Loop Break example");

		int i = 0;

		while (i < 5) {
			System.out.println("----------------------\n");
			System.out.println("i = " + i);
			i++;

			for (int j = 0; j < 3; j++) {
				System.out.println("  --> j = " + j);
				if (j > 0) {
					// Thoát khỏi vòng lặp có nhãn label1.
					break;
				}
			}
		}

		System.out.println("Done!");
	}

	public void exampleContinueAndLabel() {
		System.out.println("Labelled Loop Continue example");
		int i = 0;
		label1: while (i < 5) {
			System.out.println("outer i= " + i);
			i++;

			label2: for (int j = 0; j < 3; j++) {
				if (j > 0) {
					continue label2;
				}
				if (i > 1) {
					continue label1;
				}
				System.out.println("inner i= " + i + ", j= " + j);
			}
		}
	}
}
