package Practice0330;

import java.util.Scanner;

public class Practice0330_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1번부터 n번까지의 합을 구합니다.n의 값:");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<= n; i++)
            sum+= i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
