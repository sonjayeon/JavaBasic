package Practice0330;

import java.util.Random;

public class Practice0330_03 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("컴퓨터가 낸 것:");
        int hand = rand.nextInt(3);
        switch (hand) {
            case 0:
                System.out.println("가위"); break;
            case 1:
                System.out.println("보"); break;
            case 2:
                System.out.println("바위"); break;
        }
    }
}
