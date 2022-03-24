package chap14;

class Computer4{
    private String os;
    private int memory;

    public Computer4(){
        this.os = null;
        this.memory = 0;
        System.out.println("PC를 만들었습니다.");
    }
    public Computer4(String os, int memory){
        this();
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB의 컴퓨터를 만들었습니다.");
    }
    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}

public class NestedConstructor {
    public static void main(String[] args) {
        Computer4 com = new Computer4("windows 11", 64);
        com.show();
    }
}
