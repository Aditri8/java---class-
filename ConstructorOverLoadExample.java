class BoxDim{
    double width;
    double depth;
    double height;
    // default
    BoxDim(){
        width  = -1;
        depth  = -1;
        height = -1;
    }
    BoxDim(double width, double depth, double height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    // when cube
    BoxDim(double len){
        width = depth = height = len;
    }
    void volume(){
        double vol= this.width * this.depth * this.height;
        if (vol>0)
            System.out.println("Volume:" +vol);
        else
            System.out.println("Shape not defined!");
    }
}

public class ConstructorOverLoadExample {
    public static void main(String args[]){
        BoxDim myBox = new BoxDim();
        myBox.volume();
        BoxDim myBox1 = new BoxDim(10.0);
        myBox1.volume();
        BoxDim myBox2 = new BoxDim(10.0, 20.0, 30.0);
        myBox2.volume();

    }
}
