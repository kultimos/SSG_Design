package com.kul;

public class Test {
    public static void main(String[] args) {
        C c = new C();

    }
}


class A extends C{
    public int test(int x, int y) {
        return x - y;
    }
}

class B extends C {
    public int test(int x, int y) {
        return x+y;
    }
}

class C{

}

