package chap11;

public class Practice02_1 {
    public static void main(String[] args) {
        question02();
    }
    public static void question02(){
        int[] num = {12, 2, 3, 4, 8, 15, 1, 5, 7, 4};
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i] * 2);
        }
    }
}
