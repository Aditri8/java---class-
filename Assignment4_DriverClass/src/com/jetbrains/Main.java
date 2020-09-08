import MyPack.Dimensions;
import java.util.Scanner;

public class TestDim{
    public static void main(String[] args){
        Dimensions test =  new Dimensions(15,18,25,20,1);
        public static void main(String[] args) {
            int type;
            double null_dim = 0;

            test.volume();
            test.area();
            Scanner sc;
            Dimensions test;

            sc = new Scanner(System.in);
            System.out.print("Please enter shape type: ");
            type = sc.nextInt();

            if (type == -1) {
                System.out.println("You selected circle");
                double radius;
                System.out.print("Please enter the radius: ");
                radius = sc.nextDouble();

                test = new Dimensions(null_dim, null_dim, null_dim, radius, type);
                System.out.println("The area of the circle is:"+test.area());
            }

            else if(type == 1) {
                System.out.println("You selected cuboid");
                double length;
                double width;
                double height;

                System.out.print("Please enter the length: ");
                length = sc.nextDouble();
                System.out.print("Please enter the width: ");
                width = sc.nextDouble();
                System.out.print("Please enter the height: ");
                height = sc.nextDouble();

                test = new Dimensions(length, width, height, null_dim, type);
                System.out.println("The volume of the cuboid is:"+test.volume());

            }
        }
    }