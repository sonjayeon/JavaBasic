package chap09;

public class MyAdditionMethod {
    static int additionMethod(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // void는 return하는 값이 없다
    public static void main(String[] args){

        // 계산용 값을 관리하는 변수 선언 및 초기화
        int a = 5;
        int b = 10;

        // return한 값이 answer로 들어감
        int answer = additionMethod(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + answer);
    }
}
