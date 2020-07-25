class Test{
    void test(){
        System.out.println("parameter less test!");
    }
    void test(int a){
        System.out.println("One parameter (int):" +a);
    }
    void test(int a, int b){
        System.out.println("Two parameters (int):" +a+" "+b);
    }
    void test(double a){
        System.out.println("One parameter (double):" +a);
    }
}

class OverLoadExample {
    public static void main(String args[]){
        Test myObj = new Test();
        // simple overload
//        myObj.test();
//        myObj.test(1);
//        myObj.test(1, 2);
//        myObj.test(2.9);
        int i = 9;
        myObj.test(i);
    }
}
