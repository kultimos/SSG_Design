package com.kul.prototype.deep;

public class DClient {
    public static void main(String[] args) {
        DCitation citation = new DCitation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        DCitation clone1 = citation.clone();
        clone1.getStudent().setName("李四");
        citation.show();
        clone1.show();
        System.out.println(citation.getStudent() == clone1.getStudent());
    }
}
