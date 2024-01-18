package bussiness;

import java.util.Scanner;


public class BookManagement {
    public static Book[] books = new Book[0];
    //Phương thức Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách

    public void addBook(Scanner sc) {
        System.out.println("Nhập số lượng sách muốn thêm");
        int n = Integer.parseInt(sc.nextLine());
        if(n<100){
            //tạo mảng sách mới
            Book[] newArr = new Book[books.length + n];
            for (int i = 0; i < books.length; i++) {
                newArr[i] = books[i];

            }
            for (int i = 0; i < n; i++) {
                Book newbook = new Book();
                newbook.inputData(sc);
                newArr[books.length + i] = newbook;

            }
            //gán lại giá trị mảng books
            books = newArr;
        }else{
            System.out.println("thêm tối đa là 99 sách");
        }
    }

    //Phương thức Hiển thị thông tin tất cả sách trong thư viện
    public void displayAll() {
        if (books.length == 0) {
            System.out.println("Danh sách trống");
        } else {
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
        }
    }

    //Phương thức Sắp xếp sách theo lợi nhuận tăng dần
    public void compareTo() {
        System.out.println(books);
        displayAll();
    }



    //tìm sách theo id
    public int findIndex(Book[] arr, int id) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() == id) {
                index = i;
            }
        }

        return index;
    }

    ;

    //Phương thức Xóa sách theo mã sách
    public void deleteBook(Scanner sc) {
        System.out.println("nhập id sách mà bạn muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        int index = findIndex(books, id);
        if (index != -1) {
            Book[] newArr = new Book[books.length - 1];
            for (int i = 0; i < books.length; i++) {
                if (i < index) {
                    newArr[i] = books[i];
                }
                if (i > index) {
                    newArr[i - 1] = books[i];
                }
            }
            books = newArr;

        } else {
            System.out.println("nhập sai id của sách");
        }
    }

    //Phương thức Thay đổi thông tin sách theo mã sách
    public void updateBook(Scanner sc) {
        System.out.println("nhập id sách mà bạn muốn sửa");
        int id = Integer.parseInt(sc.nextLine());
        int index = findIndex(books, id);
        if (index != -1) {
            books[index].inputData(sc);
            System.out.println("sửa thành công");
            displayAll();
        } else {
            System.out.println("nhập sai id của sách");
        }
    }

    //Phương thức Tìm kiếm tương đối sách theo tên sách hoặc mô tả
    public void search(Scanner sc) {
        while (true) {
            System.out.println("nhập lựa chọn " +
                    "(1) để tìm sách theo tên" +
                    "(2) để tìm sách theo mô tả" +
                    "(3) thoát chương trình");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập tên sách");
                    String bookName = sc.nextLine();
                    searchBookByName(bookName,books);
                    break;
                case 2:
                    System.out.println("nhập mô tả về sách");
                    String descriptions=sc.nextLine();
                    searchBookByDescriptions(descriptions,books);
                case 3:
                    System.exit(0);
                default:
                    System.out.println("nhập sai lựa chọn");
            }
        }
    }

    //tìm sách theo tên
    public static Book searchBookByName(String name, Book[] books) {
        for (Book book : books) {
            if (book.getBookName().equals(name)) {
                return book;
            }
        }
        return null; // Trả về null nếu không tìm thấy sách
    }
    //tìm sách theo mô tả
    public static Book searchBookByDescriptions(String descriptions, Book[] books) {
        for (Book book : books) {
            if (book.getDescriptions().equals(descriptions)) {
                return book;
            }
        }
        return null; // Trả về null nếu không tìm thấy sách
    }
}
