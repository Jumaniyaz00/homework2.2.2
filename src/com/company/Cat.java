package com.company;

public class Cat extends Animals implements Printable {
    public String type;

    public Cat(String cat, String type) {
        super(cat);
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println(getName()+ type);

    }
}
