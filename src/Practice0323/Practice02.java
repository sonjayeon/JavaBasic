package Practice0323;

public class Practice02 {
    public static void main(String[] args) {
        question02(4,5,6);
    }
    public static void question02(double a, double b, double c){

        double determinant;
        double root;
        determinant = (b*b) - (4*a*c);
        root = Math.sqrt(determinant);

        if(determinant > 0){
            System.out.println("실수해");
        }else if(determinant == 0){
            System.out.println("중해");
        }else if(determinant < 0){
            System.out.println("허수해");
        }
    }
}
