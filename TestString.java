public class TestString {

    public static void main(String[] args) {

        System.out.println("Part1: Create");
        /*Creat String */
        //1. Declare first and assign later
        String s1;
        s1 = "hello";
        System.out.println("s1 = " + s1);

        //2. Assigned at declaration
        String s2 = "hello";
        System.out.println("s2 = " + s2);

        //3. Use keywords `new` to creat `String`
        String s3 = new String("hello");
        System.out.println("s3 = " + s3);

        //4. Use character array to create `String`
        char[] c4 = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(c4);
        System.out.println("s4 = " + s4);

        System.out.println("\nPart2:Operate");
        /*Common operations on strings */
        //1. Get the length of String
        System.out.print("The length of s1 :");
        System.out.println(s1.length());

        System.out.println("\nConcatenate strings");
        //2. Concatenate strings
        String s5 = ",world";
        //Method 1
        System.out.println(s1 + s5);
        System.out.println(s1 + 10);
        //Method 2
        System.out.println(s1.concat(s5));
        //System.out.println(s1.concat(10));
        //Wrong! The argument must be String
        //System.out.println(s1.concat(s2, s5));
        //Wrong! The number of arguments is only 1
        System.out.println(s1.concat(s1));//hellohello

        System.out.println("\nCompare s1 vs s2, s3, s4");
        //3. Compare Strings
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false

        System.out.println("\nuse method `equals`:");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        //The reason is s1&s2 are in Constant Pool,so the string is unique
        //But use new to create instance is in heap

        
        /* */
    }
}