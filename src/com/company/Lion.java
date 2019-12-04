package com.company;

public class Lion extends Animals  implements Printable{
    public String  color;

    public Lion(String lion, String color) {
        super(lion);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(getName()+ color);
    }
}
