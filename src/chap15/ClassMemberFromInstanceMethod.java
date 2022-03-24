package chap15;

class Computer3{
    private String os;
    private int memory;
    public static int sum;

    public Computer3(){
        this.os = null;
        this.memory = 0;
        sum++;
        System.out.println("PC가 만들어졌습니다.");
    }
    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB입니다.");
    }
    public static void showSum(){
        System.out.println("생성된 PC는 " + sum + "대 만들었습니다.");
    }
    public static void checkSum(){
        if(sum>2){
            System.out.println(" " + sum + "대의 PC가 만들어졌기 때문에 유지보수를 하세요.");
        }else{
            System.out.println(" " + sum + "대 이하이므로 유지보수가 필요없습니다.");
        }
    }
}
public class ClassMemberFromInstanceMethod {
    public static void main(String[] args) {
        Computer3 com1 = new Computer3();
        com1.setOsMemory("windows 11", 64);
        com1.checkSum();

        Computer3 com2 = new Computer3();
        com2.setOsMemory("windows 10", 16);
        com2.checkSum();

        Computer3 com3 = new Computer3();
        com3.setOsMemory("Android", 8);
        com3.checkSum();
    }
}
