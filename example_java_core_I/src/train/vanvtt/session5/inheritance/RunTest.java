package train.vanvtt.session5.inheritance;

import java.util.Scanner;

public class RunTest {

	public static void main(String[] args) {
		// Nhập vào số lượng nhân viên trong công ty
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số lượng nhân viên: ");
        int tongNhanVien = Integer.parseInt(scanner.nextLine());
         
        // Khai báo mảng các nhân viên
        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            // Người dùng nhập thông tin nhân viên
            System.out.print("Tên nhân viên " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Là nhân viên (1-Dev; 2-QA): ");
            int laNhanVien = Integer.parseInt(scanner.nextLine());
            if (laNhanVien == 1) {
                System.out.print("Công việc (1- Phát triển WEB; 2-Mobile): ");
                String congViec = scanner.nextLine();
                
                mangNhanVien[i] = new Dev(ten, "NV" + i, congViec);
            } else {
                System.out.print("Có thể test automation  ko? (1 - có; 2 - Không)");
                boolean isTestAuto = Boolean.parseBoolean(scanner.nextLine());
                mangNhanVien[i] = new QA(isTestAuto, ten, "NV" + i) ;
            }
            System.out.println("\n");
        }
         
        System.out.println("\n Hiển thị Thông tin nhân viên Công ty\n");
         
        // Xuất thông tin nhân viên
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.xuatThongTin();
        }

	}

}
