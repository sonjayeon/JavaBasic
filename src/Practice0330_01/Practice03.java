package Practice0330_01;

import java.util.Scanner;

public class Practice03 {
    static int med3(int a, int b, int c) {
       if(a>=b){
           if(b>=c){
               return b;
           }else if (a<=c) {
               return a;
           }else {
               return c;
           }
       }else if(a>c){
           return a;
       }else if(b>c){
           return c;
       }else {
           return b;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수a: "); int a = sc.nextInt();
        System.out.println("정수b: "); int b = sc.nextInt();
        System.out.println("정수c: "); int c = sc.nextInt();

        System.out.println("중간값: " + med3(a, b, c));
    }
}


