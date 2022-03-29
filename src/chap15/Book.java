package chap15;

import java.util.Scanner;

public class Book {
    private static int count = 0;
    private String title;
    private int price;
    private int number;

    public Book(String title, int price){
        ++count;
        this.title = title;
        this.price = price;
        this.number = count;
    }
    public void showBook(){
        System.out.println("이 책의 제목은 " + this.title + " 이고 가격은 " + this.price + "원입니다.");
        System.out.println("생성횟수는 " + this.number + " 입니다,");
    }
    public static int getCount(){
        return count;
    }
}

class Practice1502 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.println("책 제목 입력: ");
            String title = sc.next();
            System.out.println("책 가격 입력:");
            int price = sc.nextInt();

            Book book = new Book(title, price);
            book.showBook();

            System.out.println();
        }
        System.out.println("책 생성 횟수는 " + Book.getCount() + "회입니다.");
    }
}
