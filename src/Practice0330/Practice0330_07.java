package Practice0330;

import java.util.Random;
import java.util.Scanner;

public class Practice0330_07 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] dayKor = {"일", "월", "화", "수", "목", "금", "토"};
        String[] dayEnd = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        System.out.println("요일명을 영어 소문자로 입력하시오.");

        int retry; // 다시 한번
        int last = -1; // 이전 요일

        do{
            int day;
            do{
                day = rand.nextInt(7);
            } while(day == last);
            last = day;

            while(true){
                System.out.print(dayKor[day] + "요일:");
                String s = sc.next();

                if(s.equals(dayEnd[day])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.println("정답입니다. 다시 한번? 1-Yes/0-No");
            retry = sc.nextInt();
        } while(retry == 1);
    }
}
