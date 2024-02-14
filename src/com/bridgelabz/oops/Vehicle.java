package com.bridgelabz.oops;
interface Vehicle {
    void start();
     void stop();

}
 class Car implements Vehicle{
    public void start(){
        System.out.println("the engine start");
    }public void stop(){
         System.out.println("the engine  stops");
     }
}


class Mycar{
public static void main(String[] args) {
    Car honda =  new Car();
    honda.start();
    honda.stop();
}}
