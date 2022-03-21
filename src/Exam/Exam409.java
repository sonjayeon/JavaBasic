package Exam;

public class Exam409 {
    public static void main(String[] args) {
        for(int n=10000; n<10100; n++){
            if(IsPrimeNumber(n))
                System.out.println(n + " ");
        }
    }
    public static boolean IsPrimeNumber(int num) {
        if(num <= 3)
            return true;

        for(int i=2; i<=num/2; i++)
            if((num%i) == 0)
                return false;

        return true;
    }
}
