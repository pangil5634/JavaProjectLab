package com.example.lab1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello world!!!\n");
    System.out.print("이름 입력 : ");
    String name = sc.next();
    System.out.println("[" + name + "]님 환영합니다~");
    }
}