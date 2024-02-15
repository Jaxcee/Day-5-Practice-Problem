package com.bridgelabz.oops;

abstract class Shape {
    abstract double area();
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Print {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());
    }
}