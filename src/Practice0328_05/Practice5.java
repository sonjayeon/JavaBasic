package Practice0328_05;

public class Practice5 {
    public static void main(String[] args) {
        int value = 16;

        System.out.println("value: " + value);

        if (value % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        if (value % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }
        if (value % 4 == 0) {
            System.out.println("4의 배수입니다.");
        }
        if (value % 5 == 0) {
            System.out.println("5의 배수입니다.");
        }
    }
}
