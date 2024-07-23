package com.kul.prototype.deep;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

import java.io.*;

public class DCitation implements Cloneable, Serializable {

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;

    public void show() {
        System.out.println("我叫" + student.getName());
    }

    /**
     * 通过序列化的方式实现深拷贝
     * @return
     */
    @Override
    public DCitation clone() {
        try {
            DCitation clone = (DCitation)super.clone();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\t-wushuai\\Desktop\\c.txt"));
            oos.writeObject(clone);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\t-wushuai\\Desktop\\c.txt"));
            return (DCitation) ois.readObject();
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
