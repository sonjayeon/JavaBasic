package chap11;

public class Practice03_2 {
    public static void main(String[] args) {
        for(int n=11; n<=20; n++){
            System.out.print(fibonacci(n) + " ");
        }
    }
    static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if (n ==1)
            return 1;
        else
            return fibonacci(n-2) + fibonacci(n-1);
    }
}
