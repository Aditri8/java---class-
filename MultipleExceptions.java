import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int d = 24/a;

            int[] arr = {2};
            arr[99] = 3;
        }
//        catch (ArithmeticException e){
//            System.out.println("caught: " +e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("caught: " +e);
//        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("caught: " +e);
        }
    }

}
