package com.jetbrains;

//to calculate the area of a circle of given radius

class Dimensions{
    double radius;
    double area() {
        return (3.14 * radius * radius);
    }

    Dimensions(double radius) {

        this.radius = radius;
    }
}
    class Area{
        public static void main(String[] args) {
            Dimensions my_Dimensions = new Dimensions(28);
            System.out.println("Area:"+my_Dimensions.area());
        }
    }
