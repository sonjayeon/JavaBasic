package chap16_2;

public class DifferentPackage1 {
    public static void main(String[] args) {
        chap16_1.Computer3 com = new chap16_1.Computer3();
        com.setOsMemory("windows 11", 32);
        com.show();
    }
}
