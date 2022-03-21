package Exam;

import java.util.Scanner;

public class Exam35 {
    public static void main(String[] args) {
        question35();
    }
    public static void question35(){
        Scanner sc = new Scanner(System.in);
        System.out.println(("숫자입력 : "));
        int num = sc.nextInt();
        sc.close();

        num = Math.abs(num);
        System.out.println(num);

    }
}
