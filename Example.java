// info. class
class Box{
    double width;
    double height;
    double depth;

    double volume(){
        return (width* height* depth);
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height= height;
        this.depth = depth;
    }
}

// driver class
class TestProject {
    public static void main(String args[]){
        Box mybox_0 = new Box(10.0, 10.0, 10.0);
        System.out.println("Volume: "+mybox_0.volume());

        Box mybox_1 = new Box(20.0, 20.0, 20.0);
        System.out.println("Volume: "+mybox_1.volume());
    }
}

