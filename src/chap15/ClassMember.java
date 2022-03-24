package chap15;

class Computer2{
    private String os;
    private int memory;
    public static int sum;

    public Computer2(){
        this.os = null;
        this.memory = 0;
        sum++;
        System.out.println("PC를 만들었습니다.");
    }
    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB로 변경했습니다.");
    }
    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
    public static void showSum(){
        System.out.println("PC 제작된 갯수는 " + sum + "대입니다.");
    }
}

public class ClassMember {
    public static void main(String[] args) {
        Computer2.sum = 0;
        Computer2.showSum();

        Computer2 com1 = new Computer2();
        com1.setOsMemory("windows 11", 64);
        com1.show();
        Computer2.showSum();

        Computer2 com2 = new Computer2();
        com2.setOsMemory("windows 10", 8);
        com2.show();
        Computer2.showSum();
    }
}
