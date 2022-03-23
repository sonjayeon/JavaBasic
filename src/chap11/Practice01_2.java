package chap11;

public class Practice01_2 {
    public static void main(String[] args) {
        question1();
    }
    public static void question1(){
        int[] num = {15, 20, 14, 5, 7, 5, 4, 7, 10, 25};
        int sum = 0;
        int avg = 0;

        for(int i =0; i < num.length; i++){
            sum += num[i];
            avg = sum / num.length ;

        }
        System.out.println("평균 : " + avg);
    }
}
