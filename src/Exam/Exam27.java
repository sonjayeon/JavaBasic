package Exam;

public class Exam27 {
    public static void main(String[] args) {
        question27(9);
    }
    public static void question27(int num1){
        for(int i =1; i<10; i++){
            if((!(i==num1)) && (!(i==(num1+1)))){
                System.out.println(i);
            }
        }
    }

}
