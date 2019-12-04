package com.company;

public class Main {

    public static void main(String[] args) {
createObject("Cat");
createObject("Dog");
createObject("Lion");
    }
    public static Animals createObject(String className) {
        switch (className) {
            case "Cat":
                Cat cat = new Cat("Cat"," pet");
                cat.print();
                return cat;
            case "Dog":
                Dog dog = new Dog("Dog ",4);
                dog.print();
                return dog;
            case "Lion":
                Lion lion = new Lion( "Lion ","black");
                lion.print();
                return  lion;
        }
        return null;
    }
}
