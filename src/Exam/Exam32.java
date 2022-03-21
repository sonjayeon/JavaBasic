package Exam;

public class Exam32 {
    public static void main(String[] args) {
        question32();
    }
    public static void question32(){
        int[] arr = new int[] {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

        for(int index = 0; index < 9; index++){

            int currentValue = arr[index];
            int nextIndex = index + 1;
            int nextValue = arr[nextIndex];
            System.out.println(currentValue - nextValue);
        }

    }
}
