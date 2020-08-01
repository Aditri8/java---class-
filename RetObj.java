class TestFour{
    int a;
    TestFour(int i){
        a = i;
    }
    TestFour IncrByTen(){
        return new TestFour(a+10);
    }
    /*
    TestFour IncrByTen(){
        TestFour tempObj = new TestFour(a+10);
        return  tempObj;
    }
    */
}

public class RetObj {
    public static void main(String args[]){
        TestFour myObj = new TestFour(2);
        TestFour myObj2;

        myObj2 = myObj.IncrByTen();

        System.out.println("Before: " +myObj.a);
        System.out.println("After: " +myObj2.a);
    }
}
