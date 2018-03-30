package ua.design.pattern.dao;

public class Student {
    private String name;
    private int rolNo;

    Student(String name, int rolNo){
        this.name = name;
        this.rolNo = rolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRolNo() {
        return rolNo;
    }

    public void setRolNo(int rolNo) {
        this.rolNo = rolNo;
    }
}
