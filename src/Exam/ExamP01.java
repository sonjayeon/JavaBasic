package Exam;

public class ExamP01 {
    public static void main(String[] args) {
        questionP01(2450);
    }
    public static void questionP01(int m){
        int taxi = 6100;
        int price = 0;

        if(m < 1700) {
            price = taxi;
        }else{
            double increase = m - 1700;
            double num = increase / 313;

            price = Double.valueOf(taxi + (Math.ceil(num) * 800)).intValue();
        }
        System.out.println("택시요금 : " + price + "원");
    }
}
