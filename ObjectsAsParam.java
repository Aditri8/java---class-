class TestObj{
    int a;
    int b;

    TestObj(int i, int j){
        a = i;
        b = j;
    }

    boolean isEqual(TestObj o){
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}

public class ObjectsAsParam {
    public static void main(String args[]){
        TestObj myObj1 = new TestObj(1,2);
        TestObj myObj2 = new TestObj(10, 20);
        TestObj myObj3 = new TestObj(1, 2);
        System.out.println("myObj1 and myObj2 test: "+myObj1.isEqual(myObj2));
        System.out.println("myObj3 and myObj1 test: "+myObj3.isEqual(myObj1));
    }

}
