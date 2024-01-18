package bussiness;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManagement bookManagement=new BookManagement();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU**************");
            System.out.println("Chọn 1: Nhập số sách (n) cần nhập thông tin từ bàn phím và thực hiện nhập thông tin cho\n" +
                    "n cuốn sách đó ,\n" +
                    "Chọn 2: Hiển thị tất cả sách đang lưu trữ .\n" +
                    "Chọn 3: Sử dụng thuật toán sắp xếp để sắp xếp sách đang lưu trữ theo lợi nhuận tăng.\n" +
                    "Chọn 4: Nhập mã sách cần xóa từ bàn phím, thực hiện xóa sách trong danh sách.\n" +
                    "Chọn 5: Nhập chuỗi tìm kiếm từ bàn phím, thực hiện tìm và in ra những sách có tên hoặc\n" +
                    "mô tả phù hợp.\n" +
                    "Chọn 6: Nhập vào mã sản phẩm, thay đổi các thông tin sách , chú ý validate dữ liệu như\n" +
                    "thêm mới.\n" +
                    "Chọn 7: Thoát khỏi chương trình");
            int choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    bookManagement.addBook(sc);
                    break;
                case 2:
                    bookManagement.displayAll();

                    break;
                case 3:
                    bookManagement.compareTo();

                    break;
                case 4:
                    bookManagement.deleteBook(sc);

                    break;
                case 5:
                    bookManagement.search(sc);

                    break;
                case 6:
                    bookManagement.updateBook(sc);

                    break;
                case 7:
                        System.exit(0);
                    break;
                default:
                    System.out.println("nhập sai lựa chọn");
            }
        }
    }
}
