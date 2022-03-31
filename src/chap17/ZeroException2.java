package chap17;

public class ZeroException2 {
    public static void main(String[] args) {
        try{
            int num = 10/0;

            System.out.println("10/0 결과: " + num);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("처리 종료");
    }
}
