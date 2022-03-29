package Practice0325;

public class Practice1 {
    public static void main(String[] args) {
        // Employee 클래스 객체 만들기
        Employee employee = new Employee();
        // Employeeオ객체에 직원번호와 직원명을 설정함
        employee.setData(1234, "홍길동");
        // Employee객체의 직원번호 출력
        System.out.println("직원번호：" + employee.getId());
        // Employee객체의 직원명 출력
        System.out.println("직원명：" + employee.getName());
    }
}
class Employee {

    private int id;
    private String name;

    public void setData(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
