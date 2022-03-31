package Practice0330;
import java.util.Scanner;
public class Practice0330_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 a:"); int a = sc.nextInt();
        System.out.println("정수 b:"); int b = sc.nextInt();

        int diff;

        if (a>=b){
            diff = a - b;
        }else{
            diff = b - a;
        }
        System.out.println("두 값의 차이는 " + (a-b) + "입니다.");
    }
}
