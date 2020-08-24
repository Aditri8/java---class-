public class StringEssentials {
    public static void main(String[] ags){
        // create an empty String
        // String s = new String();

        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(alpha, 1, 3);   // constructor String(char alpha, int startIndex, int numChar)

        String s1 = new String(s);
        System.out.println(s1);

    }
}

public class StringEssentials {
    public static void main(String[] ags){
        // create an empty String
        // String s = new String();

        byte[] alpha = {65, 66, 67, 68, 69, 70};
        String s = new String(alpha);
        System.out.println(s);

        String s1 = new String(alpha, 2, 3);
        System.out.println(s1);

    }
}

public class StringEssentials {
    public static void main(String[] ags){
//        char[] src = {'a', 'b', 'c'};
//        String s = new String(src);

        String s = "abc" + "def"; // string literal

        System.out.println(s);

    }
}

public class StringEssentials {
    public static void main(String[] ags){
        String age = "this is:"+ (9+9);
        //int age = 9;
        // String s = "He is " + age + " years old."; // string literal

        System.out.println(age);

    }
}








