class TestTwo{
    void meth(int i, int j){
        i *=2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String args[]){
        TestTwo myObj = new TestTwo();

        int a = 10, b = 20;
        System.out.println("Before call: " +a+ " "+b);

        myObj.meth(a, b);
        System.out.println("After call: "+a+ " "+b);
    }
}
