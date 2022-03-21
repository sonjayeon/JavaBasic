package Exam;

import java.util.Scanner;

public class Exam33 {
    public static void main(String[] args) {
        question33();
    }
    public static void question33(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

    }
}
