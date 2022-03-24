package chap14;

class Computer1{
    private String os;
    private int memory;

    public void setComputer(String os){
        this.os = os;
        System.out.println("OS는 " + os + "로 변경했습니다.");
    }
    public void setComputer(int memory){
        this.memory = memory;
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
    public void setComputer(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB로 변경했습니다.");
    }
    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }

}
public class OverLoadMethod {
    public static void main(String[] args) {
        Computer1 com = new Computer1();

        com.setComputer("windows 11", 32);
        com.show();
        System.out.println("================================================");

        com.setComputer("windows 10");
        com.show();
        System.out.println("=================================================");

        com.setComputer(256);
        com.show();

    }
}
