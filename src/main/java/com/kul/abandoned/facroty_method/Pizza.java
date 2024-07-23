package com.kul.abandoned.facroty_method;

public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料这步,不同的pizza之间有差异,因此我们做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "Baking method " );
    }

    public void cut() {
        System.out.println(name + "Cutting method " );
    }

    public void box() {
        System.out.println(name + "Boxing method " );
    }

    public void setName(String name) {
        this.name = name;
    }

}
