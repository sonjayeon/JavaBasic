package Exam;

public class Exam24 {
    public static void main(String[] args) {
        question24(20);
    }
    public static void question24(int num1){
        for(int i = 0; i<num1; i++){
            System.out.print("*");
            if(i % 5 ==0) {
                System.out.print("\t");
            }
        }
    }
}
