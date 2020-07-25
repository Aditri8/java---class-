class BoxAndCircle{
    double width;
    double depth;
    double height;
    double radius;

    // default
    BoxAndCircle(){
        width  = -1;
        depth  = -1;
        height = -1;
        radius = -1;
        System.out.println("Pass -1 to select circle\n" +
                           "Pass 1 to select rectangle");
    }

    BoxAndCircle(int shape, double radius, double width, double depth, double height){
        if(shape == -1){
            this.radius = radius;
            System.out.println("Circle selected!");
        }
        else if (shape == 1){
            this.width = width;
            this.depth = depth;
            this.height = height;
            System.out.println("Rectangle selected!");
        }
    }

    void volume(){
        double vol= this.width * this.depth * this.height;
        if (this.width>0)
            System.out.println("Volume:" +vol+ " cm3");
        else
            System.out.println("Rectangle shape not defined!");
    }

    void area(){
        double area = 3.14*radius*radius;
        if (this.radius>0)
            System.out.println("Area:" +area+ " cm2");
        else
            System.out.println("Circle shape not defined!");
    }
}

public class Assignment2 {
    public static void main(String args[]){
        BoxAndCircle myBox = new BoxAndCircle(1, 10.0, 10.0, 20.0, 30.0);
        myBox.volume();
        myBox.area();

    }
}
