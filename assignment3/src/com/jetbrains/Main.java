

class Fibonacci {
        static int fib(int t) {
            if(t <= 1)
            return t;

            else
                return fib(t - 2) + fib(t - 1);
        }

        public static void main(String args[]) {

            int NoOfTerms= 20;
                System.out.print("Fibonacci series upto "+NoOfTerms+" terms:\n");
                int i;
                for(i=0; i<NoOfTerms; i++){
                    System.out.print(fib(i)+",");
            }

        }
    }

