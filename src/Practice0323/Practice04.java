package Practice0323;

public class Practice04 {
    public static void main(String[] args) {
        question04(2016);
    }
    public static void question04(int num){
        if(num % 4 == 0 && (num % 100) == 0 && (num % 400) == 0){
            System.out.println("윤년");
        }else{
            System.out.println("평년");
        }

    }
}
