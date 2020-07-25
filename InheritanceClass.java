
class A {
    int i;
    int j;

    void showij() {
        System.out.println("Value of i and j are:" + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("Value of k:"+k);
    }
    void sum(){
        System.out.println("Sum: "+ (i+j+k));
    }
}

class InheritanceClass {
    public static void main(String args[]){
    A superObj = new A();
    B subObj = new B();

    superObj.i = 2;
    superObj.j = 3;
    superObj.showij();
    // subObj.showij();

    subObj.i = 10;
    subObj.j = 20;
    subObj.k = 30;
    subObj.showij();
    subObj.sum();
    }
}
