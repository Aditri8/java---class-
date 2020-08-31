package MyPack;

public class Dimensions {
    double length;
    double width;
    double height;
    double radius;

    Dimensions(){
        length= -1;
        width= -1;
        height= -1;
        radius= -1;
        System.out.println("enter 1 to select cuboid "+"enter -1 to select circle");

    }

    public Dimensions(double length,double width,double height,double radius,int shape) {
        if (shape==1) {
            this.length = length;
            this.width = width;
            this.height = height;
            System.out.println("You selected cuboid");
        }

        else if (shape==-1)
        { this.radius = radius;
            System.out.println("You selected circle");
        }

    }

    public void volume() {
        double volume = length * width * height;
        System.out.println("The volume of the cuboid is:"+volume);
    }

    public void area() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is:" +area);
    }
}
