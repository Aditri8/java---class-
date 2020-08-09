package MyPack;

public class Balance {
    String name;
    double balance;

    public Balance(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void show(){
        if(balance<=0){
            System.out.print(" Account zero ");
        }
        else {
            System.out.println(name + " has a balance of: $" + balance);
        }
    }
}
