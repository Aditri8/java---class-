class Dimensions1{
    double radius;
    double area() {
        return (3.14 * radius * radius);
    }

    Dimensions1(double radius) {
        this.radius = radius;
    }
}
    class Area{
        public static void main(String[] args) {
            Dimensions1 my_Dimensions = new Dimensions1(28);
            System.out.println("Area:"+my_Dimensions.area());
        }
    }
