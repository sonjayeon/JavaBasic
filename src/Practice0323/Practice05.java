package Practice0323;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=2; i<= num; i++){
            while(num % i == 0){
                System.out.println(i);
                num = num/i;
            }
        }

    }
}
