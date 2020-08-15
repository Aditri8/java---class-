import java.io.*;

public class FileIO {
    public static void main(String[] args){
        int i;

        FileInputStream fin = null;

        if(args.length != 1){
            System.out.println("Try java FileIO <user file name>");
        }

        // open
        try {
            fin = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException e){
            System.out.println("Can not open the file, try proper file name");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No file name given!");
        }

        // read for file
        try{
            do {
                i = fin.read();
                if(i != -1){
                    System.out.print((char)i);
                }
            } while(i != -1);
        }
        catch (IOException | NullPointerException e){
            System.out.println("Error in reading the file!");
        }

        // close file

        try {
            fin.close();
        }
        catch (IOException | NullPointerException e){
            System.out.println("Error in closing file!");
        }

    }
}
