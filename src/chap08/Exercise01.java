package chap08;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0.0;
        int[] score = new int[5];

        for(int i = 0; i < score.length; i++){
            System.out.println((i+1) + " 입력 : ");
            score[i] = sc.nextInt();
        }
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }

        avg = (double) sum / score.length;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
