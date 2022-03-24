package chap14;

class Computer3 {
    private String os;
    private int memory;

    public Computer3(){
        this.os = null;
        this.memory = 0;
    }
    public Computer3(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB의 PC가 만들었습니다.");
    }
    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }

}
public class OverLoadConstructor {
    public static void main(String[] args) {
        Computer3 com1 = new Computer3();
        com1.show();
        System.out.println("================================");
        Computer3 com2 = new Computer3("windows 11", 32);
        com2.show();
    }
}
