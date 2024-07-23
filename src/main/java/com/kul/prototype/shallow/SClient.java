package com.kul.prototype.shallow;

public class SClient {
    public static void main(String[] args) {
        Citation citation = new Citation();
        citation.setName("张三");
        Citation clone1 = citation.clone();
        Citation clone2 = citation.clone();
        clone1.setName("李四");
        clone2.setName("王五");
        citation.show();
        clone1.show();
        clone2.show();
    }
}
