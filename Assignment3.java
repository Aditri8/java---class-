class fibonacci {
    int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}

public class Assignment3 {
    public static void main (String args[]){
        fibonacci myFib = new fibonacci();
        int UpTo = 9;
        for (int count=1; count<=UpTo; count++) {
            System.out.println(myFib.fib(count));
        }
    }
}

