package com.kul.builder.relombok;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().brand("华硕").name("电脑啊").build();
        System.out.println(computer.toString());
    }
}
