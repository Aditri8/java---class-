class StaticByName{
    static int a = 42;
    static int b = 99;

    static void callMe(){
        System.out.println("a: "+a);
    }
}


public class StaticDemoTwo {
    public static void main(String args[]){
        StaticByName.callMe();
        System.out.println("b: "+StaticByName.b);
    }
}
