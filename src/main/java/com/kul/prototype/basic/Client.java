package com.kul.prototype.basic;

public class Client {
    public static void main(String[] args) {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println(clone == realizeType);

    }
}
