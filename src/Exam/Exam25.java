package Exam;

public class Exam25 {
    public static void main(String[] args) {
        question25();
    }
    public static void question25(){
        for(int i =1; i<=20; i++){
            if(i%5 == 0){
                System.out.println("bar");
            } else{
                System.out.println(i);
            }
        }
    }
}
