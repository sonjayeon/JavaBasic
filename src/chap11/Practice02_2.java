package chap11;

import java.util.Scanner;

public class Practice02_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int values[] = new int[10];
       int cnt, sum;

       for(cnt = 0,sum=0; cnt<10 && sum<=100; cnt++){
           values[cnt] = sc.nextInt();
           sum += values[cnt];
        }
       for(int i =0; i<cnt; i++) {
           System.out.print("\n" + values[i]);
       }
        }
    }
