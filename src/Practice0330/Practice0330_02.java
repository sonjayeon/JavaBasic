package Practice0330;

import java.util.Scanner;

public class Practice0330_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:"); int a = sc.nextInt();
        System.out.print("정수 b:"); int b = sc.nextInt();
        System.out.print("정수 c:"); int c = sc.nextInt();

        if(a>b) {
            int t = a;
            a = b;
            b = t;
        }
        if(b>c){
            int t = b;
            b = c;
            c = t;
        }
        if(a>c){
            int t = a;
            a = c;
            c = t;
        }
        System.out.println("a < b < c가 되도록 정렬");
        System.out.println("변수 a:" + a);
        System.out.println("변수 b:" + b);
        System.out.println("변수 c:" + c);
    }
}
