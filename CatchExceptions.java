public class CatchExceptions {
        public static void main(String[] args){
            int a;
            try {
                a = 0;
                System.out.println("Division :" + 24 / a);
            }
            catch (ArithmeticException e){
                System.out.println("Caught: " +e);
            }
            System.out.println("Hello world!!");
        }
    }


