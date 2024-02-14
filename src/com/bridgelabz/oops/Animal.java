package com.bridgelabz.oops;
//Animal
interface Animal {
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("bark");
    }

    public static void main(String[] args) {
        Dog germanshepered = new Dog();
        germanshepered.sound();
    }

}
