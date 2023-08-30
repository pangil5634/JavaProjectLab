package com.example.lab2;

public class Student {

    int no;

    public int getNo() {
        return no;
    }
    public void setNo(int no){
        this.no = no;
    }

    String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Student(int no, String name, int age){
        setAge(age);
        setNo(no);
        setName(name);
    }

    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
    }
}
