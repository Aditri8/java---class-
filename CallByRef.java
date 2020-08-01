class TestThree{
    int a, b;

    TestThree(int i, int j){
        a = i;
        b = j;
    }

    void meth(TestThree o){
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByRef {
    public static void main(String args[]){
        TestThree myObj = new TestThree(10, 20);

        System.out.println("Before call: " +myObj.a+ " "+myObj.b);

        myObj.meth(myObj);
        System.out.println("After call: "+myObj.a+ " "+myObj.b);
    }
}
