package com.kul.prototype.basic;

public class RealizeType implements Cloneable{

    /**
     * 用于感知在clone()创建新对象时是否走了构造方法,结果是肯定不会走
     */
    public RealizeType(){
        System.out.println("执行构造方法");
    }

    @Override
    public RealizeType clone() {
        System.out.println("复制成功");
        try {
            return (RealizeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
