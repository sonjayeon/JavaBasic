package Practice0330;

import java.util.Scanner;
import java.util.Random;

public class Practice0330_08 {

    static Scanner sc = new Scanner(System.in);

    // 계속 할지 안할지 여부
    static boolean confirmRetry(){
        int cont;
        do{
            System.out.println("다시 한번? yes-1/No-2");
            cont = sc.nextInt();
        }while(cont != 0 && cont != 1);
        return cont == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("암산 훈련");

        do {
            int x = rand.nextInt(900)+100;
            int y = rand.nextInt(900)+100;
            int z = rand.nextInt(900)+100;
            int pattern = rand.nextInt(4);

            int answer; // 정답
            switch(pattern) {
                case 0: answer = x + y + z; break;
                case 1: answer = x + y - z; break;
                case 2: answer = x - y + z; break;
                default: answer = x - y - z; break;
            }
            while(true) {
                System.out.println(x + ((pattern < 2) ? "+":"-") + y + ((pattern % 2 == 0) ? "+":"-") + z + "=");
                int k = sc.nextInt();
                if(k == answer)
                    break;
                System.out.println("틀렸습니다.");
            }


            }while(confirmRetry());

    }
}
