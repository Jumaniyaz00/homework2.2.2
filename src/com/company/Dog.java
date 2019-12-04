package com.company;

public class Dog extends Animals implements Printable {
    public int size;

    public Dog(String dog, int size) {
        super(dog);
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println(getName()+ size);
    }
}
