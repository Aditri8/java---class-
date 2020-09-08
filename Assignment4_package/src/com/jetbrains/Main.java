package myPack;

class Dimensions {

    double length;
    double width;
    double height;
    double radius;


    Dimensions() {

      /*
        length= -1;
        width= -1;
        height= -1;
        radius= -1;*/

        System.out.println("Enter 1 to select cuboid  " + "Enter -1 to select circle");

    }

    public double Dimensions(double length, double width, double height, double radius, int shape) {

        if (shape == 1) {
            System.out.println("You selected circle");
            this.radius = radius;

            public double area(){
                return(3.14 * radius * radius);
            }
        }


        else if (shape == -1) {
            System.out.println("You selected cuboid");
            this.length = length;
            this.width = width;
            this.height = height;

            public double volume(){
                return(length * width * height);
            }
        }
    }
}

