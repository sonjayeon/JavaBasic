package Practice0330;

import java.util.Scanner;

public class Practice0330_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 맞추기 게임 시작!");

            int num = (int) (Math.random() * 90) + 10;
        System.out.println("10부터 99까지의 숫자를 맞추세요");
        int count = 0;
        int no = 0;
        while (no != num) {
            System.out.println("어떤 숫자입니까?");
            no = sc.nextInt();

            if(no > num){
                System.out.println(no + "보다 더 작은 숫자입니다.");
            }else if(no < num){
                System.out.println(no + "보다 더 큰 숫자입니다.");
            }
            count++;
            }
        System.out.println("정답입니다.");
        sc.close();

        }
    }

