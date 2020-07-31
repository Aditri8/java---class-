

class Dimensions {

    double length;
    double width;
    double height;
    double radius;


    //default constructor
    Dimensions(){
        length =-1;
        width=1;
        height=-1;
        radius=-1;
       System.out.println("enter 1 to select cuboid"+"   "+"enter -1 to select circle");

    }

   public Dimensions(double length,double width,double height,double radius,int shape) {
        if (shape==1) {
            this.length = length;
            this.width = width;
            this.height = height;
            System.out.println("You selected cuboid");
        }
        else if (shape==-1) {
            this.radius = radius;
            System.out.println("You selected circle");
        }

    }

    void volume() {
        double volume = this.length * this.width * this.height;
        System.out.println("The volume of the cuboid is:" +volume);
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is:" +area);
    }
}

      class myDimensions{
        public static void main(String[] args) {

	Dimensions myDimensions= new Dimensions(15.0,17.0,20.0,25.0,-1);

	myDimensions.volume();
	myDimensions.area();
    }
}

