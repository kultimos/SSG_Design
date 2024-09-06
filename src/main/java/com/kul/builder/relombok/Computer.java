package com.kul.builder.relombok;

public class Computer {
    private String name;
    private String brand;
    private Builder Builder;

    private Computer(Builder builder){
        this.name = builder.name;
        this.brand = builder.brand;
    }

    public static final class Builder {
        private String name;
        private String brand;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

