/* javac filname.java & java filename.java to exwcute*/
public class Learn {
    public static void main(String[] args) {
        //Multi-line print method
        System.out.println("--single line print method---");
        System.out.println("Hello World!");
        System.out.println("i am!");
        System.out.println("opty!");
        System.out.println("------------");
        System.out.println("--Multi-line print method---");
        //single line print method
        System.out.print("Hello World!-");
        System.out.print("I am ");
        System.out.print("Abid ");
        System.out.print("Hussain ");
        System.out.println("aka ");
        //here
        System.out.print("Opty");//here 16ln is singleline
        //print no,s
        System.out.println(23);//and here multiline 
        //but stilll outputs the opty23
        //whatif inverse
        System.out.println(23);//and here multiline 
        System.out.print("opty");//and here multiline 
        //singline comments
        /*muliti
        line
        comments */
        System.out.println("------"); 


        /* String - stores text,
                    such as "Hello".
                    String values are surrounded by double quotes
            int - stores integers (whole numbers),
                    without decimals, such as 123 or -123
            float - stores floating point numbers,
                    with decimals, such as 19.99 or -19.99
            char - stores single characters,
                    such as 'a' or 'B',
                    Char values are surrounded by single quotes
        */
        String a = "opty ";
        float b = (float) 6.6 ;
        char c = 'a';
        int d = 0;
        System.out.println(a + b);
        System.out.println(c);
        System.out.println(c + d);
        System.out.println(c + " " + d);
        boolean t = false;
        //Boolean values are mostly used for conditional testing.
        System.out.println(t + " " + d);
        //note
        //these a b c d t x y z are called identifiers
        //they could be different line age sum total etc...
        int x, y, z;
        x = y = z = 2;
        System.out.println(x + y);
        System.out.println(x + y - z + 3 + " " + "opty");
        System.out.println(y * z);
        /* 
        The general rules for naming variables are:
        
            --Names can contain letters, digits, underscores, and dollar signs
            --Names must begin with a letter
            --Names should start with a lowercase letter and it cannot contain whitespace
            --Names can also begin with $ and _ (but we will not use it in this tutorial)
            --Names are case sensitive ("myVar" and "myvar" are different variables)
            --Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */
        

        String lineHold = "----java Data Types----";
        System.out.println(lineHold);
        /*
        Data types are divided into two groups:

            --Primitive data types - includes byte, short, int, long, float, double, boolean and char
            --Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
        */
        /* premitive DataTypes
        DataType	    Size	    Description
        --byte	        1 byte	    Stores whole numbers from
                                        -128 to 127
        --short	        2 bytes	    Stores whole numbers from 
                                        -32,768 to 32,767
        --int	        4 bytes	    Stores whole numbers from 
                                        -2,147,483,648 to 2,147,483,647
        --long	        8 bytes	    Stores whole numbers from 
                                        -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        --float	        4 bytes	    Stores fractional numbers.
                                        Sufficient for storing 6 to 7 decimal digits
        --double	    8 bytes	    Stores fractional numbers.
                                        Sufficient for storing 15 decimal digits
        --boolean	    1 bit	    Stores true or false values
        --char	        2 bytes	    Stores a single
                                        character/letter or ASCII values
        
        primitive numbers types
            integer types           &        Floating point types
        byte, short, int, and long          float & double
                Even though there are many numeric types in Java,
            the most used for numbers are int (for whole numbers)
        and double (for floating point numbers)
        */
        /*The main difference between primitive and non-primitive data types are:

            --Primitive types are predefined (already defined) in Java. 
                Non-primitive types are created by the programmer and is not defined by Java (except for String).
            --Non-primitive types can be used to call methods to perform certain operations, 
                while primitive types cannot.
            --A primitive type has always a value, 
                while non-primitive types can be null.
            --A primitive type starts with a lowercase letter, 
                while non-primitive types starts with an uppercase letter.
            --The size of a primitive type depends on the data type, 
                while non-primitive types have all the same size.
        */


        /*
        Java Type Casting
            Type casting is when you assign a value of one primitive data type to another type.

            ==In Java, there are two types of casting:

                --Widening Casting (automatically) - converting a smaller type to a larger type size
                    byte -> short -> char -> int -> long -> float -> double

                --Narrowing Casting (manually) - converting a larger type to a smaller size type
                    double -> float -> long -> int -> char -> short -> byte
        */
        //widening casting automatically
    int aInt = 9;
    double aDouble = aInt; // Automatic casting: int to double

    System.out.println(aInt);      // Outputs 9
    System.out.println(aDouble); // Outputs 9.0
        /*Narrowing Casting
            Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        */
    double egDouble = 9.78d;
    int egInt = (int) egDouble; // Manual casting: double to int

    System.out.println(egDouble);   // Outputs 9.78
    System.out.println(egInt);      // Outputs 9

    }
}
