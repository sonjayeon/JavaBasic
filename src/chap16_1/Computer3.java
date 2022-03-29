package chap16_1;

public class Computer3 {
    private  String os;
    private int memory;

    public void show(){
        System.out.println("OS는 " + this.os + "입니다.");
        System.out.println("메모리는 " + this.memory + "GB입니다.");
    }
    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
    }
}
