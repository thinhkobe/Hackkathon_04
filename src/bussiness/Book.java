package bussiness;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double inportPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, String descriptions, double inportPrice, double exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.inportPrice = inportPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = true;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getInportPrice() {
        return inportPrice;
    }

    public void setInportPrice(double inportPrice) {
        this.inportPrice = inportPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    //phương thức input data
    public void inputData(Scanner sc) {
        System.out.println("---Nhập thông tin sách---");

        System.out.println("nhập id sách");
         this.bookId = Integer.parseInt(sc.nextLine());

        System.out.println("nhập tên sách");
        this.bookName  = sc.nextLine();

        System.out.println("nhập tác giả sách");
        this.author = sc.nextLine();

        System.out.println("nhập mô tả sách");
        this.descriptions = sc.nextLine();

        System.out.println("nhập giá sách nhập sách");
        this.inportPrice = Double.parseDouble(sc.nextLine());
        System.out.println("nhập giá bán sách");
        this.exportPrice = Double.parseDouble(sc.nextLine());


    }
    //phương thức hiển thị thông tin sách

    public void display() {
        System.out.println("Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", inportPrice=" + inportPrice +
                ", exportPrice=" + exportPrice +
                ", bookStatus=" + bookStatus +
                '}');
    }



    //phương thức tính lợi nhuận
    public void caculateInterest() {
        this.interest = (float) (this.exportPrice - this.inportPrice);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", inportPrice=" + inportPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", bookStatus=" + bookStatus +
                '}';
    }
}
