package chap11;

public class Practice03_1 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++)
            gugudanColumn(i);

    }
    static void gugudanColumn(int num) {
        for(int i=1; i<=9; i++)
            System.out.printf(" %2d", num * i);

        System.out.println();
    }
}
