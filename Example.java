// simple for
//public class Example {
//    public static void main(String args[]) {
//        for(int i = 0; i<args.length; i++){
//            System.out.println("Args["+i+"]:" +args[i]);
//        }
//    }
//}

// for each
//public class Example {
//    public static void main(String args[]) {
//        for(String i: args){
//            System.out.println(i);
//        }
//    }
//}

//public class Example {
//    public static void main(String args[]) {
//        int data[] = new int[10];
//        for(int i = 0; i<data.length; i++){
//            data[i] = i;
//        }
//
//        for(int x: data){
//            System.out.println("Data:" +x);
//        }
//    }
//}
//class Box{
//    double width;
//    double height;
//    double depth;
//    double volume(){
//        return(width* height* depth);
//    }
//}

//public class Example {
//    public static void main(String args[]) {
//     // int i[]  = new int[10]; <--just like this
//     Box mybox_0 = new Box();
//     Box mybox_1 = new Box();
//
//     mybox_0.width = 10.0;
//     mybox_0.height = 10.0;
//     mybox_0.depth = 10.0;
//
//     mybox_1.width = 20.0;
//     mybox_1.height = 20.0;
//     mybox_1.depth = 20.0;
//
//     System.out.println("Width is:  " + mybox_0.width);
//     System.out.println("Height is: " + mybox_0.height);
//     System.out.println("Depth is:  " + mybox_0.depth);
//     System.out.println("Volume Box 0:    " +mybox_0.volume());
//
//     System.out.println();
//
//     System.out.println("Width is:  " + mybox_1.width);
//     System.out.println("Height is: " + mybox_1.height);
//     System.out.println("Depth is:  " + mybox_1.depth);
//     System.out.println("Volume Box 0:    " +mybox_1.volume());
//    }
//}

//class Box{
//    double width;
//    double height;
//    double depth;
//    double volume(){
//        return(width* height* depth);
//    }
//    void setDim(double w, double h, double d){
//        width = w;
//        height = h;
//        depth = d;
//    }
//}
//
//public class Example{
//    public static void main(String args[]){
//        Box mybox_0 = new Box();
//        mybox_0.setDim(10.0, 10.0, 10.0);
//        System.out.println("Volume:  " +mybox_0.volume());
//
//        Box mybox_1 = new Box();
//        mybox_1.setDim(20.0, 20.0, 20.0);
//        System.out.println("Volume:  " +mybox_1.volume());
//    }
//}

//class Box{
//    double width;
//    double height;
//    double depth;
//    double volume(){
//        return(width* height* depth);
//    }
//    Box(){
//        width = 10.0;
//        height = 10.0;
//        depth = 10.0;
//    }
//}
//
//public class Example{
//    public static void main(String args[]){
//        Box mybox_0 = new Box();
//        System.out.println("Volume:  " +mybox_0.volume());
//    }
//}

class Box{
    double width;
    double height;
    double depth;
    double volume(){
        return (width* height* depth);
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class Example{
    public static void main(String args[]){
        Box mybox_0 = new Box(10.0, 10.0, 10.0);
        System.out.println("Volume:  " +mybox_0.volume());

        Box mybox_1 = new Box(20.0, 20.0, 20.0);
        System.out.println("Volume:  " +mybox_1.volume());
    }
}


//class Box{
//    double width;
//    double height;
//    double depth;
//    double volume(){
//        return (width* height* depth);
//    }
//    Box(double width, double height, double depth){
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }
//}
//
//public class Example{
//    public static void main(String args[]){
//        Box mybox_0 = new Box(10.0, 10.0, 10.0);
//        System.out.println("Volume:  " +mybox_0.volume());
//
//        Box mybox_1 = new Box(20.0, 20.0, 20.0);
//        System.out.println("Volume:  " +mybox_1.volume());
//    }
//}





