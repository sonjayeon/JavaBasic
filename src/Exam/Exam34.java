package Exam;

import java.util.Scanner;

public class Exam34 {
    public static void main(String[] args) {
        question34();
    }
    public static void question34(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력 : ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0){
            System.out.println("zero");
        }
    }
}
