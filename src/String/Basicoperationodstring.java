package String;

public class Basicoperationodstring {
    public static void main(String[] args) {
        String s = "Hello Java";
        String a = "Hello";
        String b = "hello";

        String obj = new String("Hello");

        System.out.println("Length: " + s.length());               // 10
        System.out.println("Character at index 1: " + s.charAt(1));// 'e'
        System.out.println("Uppercase: " + s.toUpperCase());       // "HELLO JAVA"
        System.out.println("Lowercase: " + s.toLowerCase());       // "hello java"
        System.out.println("Trimmed: " + "  Java  ".trim());      // "Java"
        System.out.println("Contains 'Java': " + s.contains("Java")); // true
        System.out.println("Starts with 'Hello': " + s.startsWith("Hello")); // true
        System.out.println("Substring (0,5): " + s.substring(0, 5)); // "Hello"
        System.out.println("Replace 'Java' with 'World': " + s.replace("Java", "World")); // "Hello World"



        // String Comparison
        // 1️⃣ Using equals() (Case-Sensitive)

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

//        Using == (Checks Memory Reference

        System.out.println(a == b); // true (same memory location)
        System.out.println(a == obj); // false (different objects)



//        5. StringBuffer & StringBuilder (Mutable)

//        Since Strings are immutable, use StringBuffer or StringBuilder for modifications.


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb); // "Hello Java"


     //  6. Convert String to Other Data Types

        String num = "123";
        int number = Integer.parseInt(num);
        System.out.println(number + 10); // 133

        int num2 = 100;
        String str = String.valueOf(num2);
        System.out.println(str + " is a string"); // "100 is a string"

        //7. String Formatting (format())

        String name = "John";
        int age = 25;
        String formatted = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formatted);


        // 8. Splitting a String

        String data = "apple,banana,grape";
        String[] fruits = data.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Reversing a String
        String str2 = "Hello";
        String reversed = new StringBuilder(str2).reverse().toString();
        System.out.println(reversed); // "olleH"

        //10. Checking Palindrome (Same Forward & Backward)
        String str3 = "madam";
        String rev = new StringBuilder(str3).reverse().toString();

        if (str3.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


    }
}
