package Practice0330;
import java.util.Scanner;
public class Practice0330_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개를 더할까요:");
        int n = sc.nextInt();

        int sum = 0;
        int i;

        for(i=0; i<n; i++){
            System.out.println("정수: ");
            int t = sc.nextInt();
            if(sum + t > 1000){
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += t;
        }
        System.out.println("합계: " + sum);
        if(i != 0)
            System.out.println("평균:" + sum/i);
    }
}
