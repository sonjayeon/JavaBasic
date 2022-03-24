package chap14;

class Computer5{
    private String os;
    private int memory;

    public Computer5(){
        this.os = null;
        this.memory = 0;
        System.out.println("PC를 만들었습니다.");
    }
    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB로 변경합니다.");
    }
    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}

public class InstanceMember {
    public static void main(String[] args) {
        Computer5 com1 = new Computer5();
        com1.setOsMemory("windows 11", 64);
        com1.show();
        System.out.println("=====================================");
        Computer5 com2 = new Computer5();
        com2.setOsMemory("windows 10", 16);
        com2.show();
    }
}
