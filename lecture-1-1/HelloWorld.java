public class HelloWorld {
    public static void main (String [] args) {

        // todo Primitive Data
        // type variable = value;
        int x = 6;
        x = x + 6;
        System.out.println(x);

        // Instantiating variable before storing value
        int y;
        y = 3;
        System.out.println(y);

        // * constant variables
        final int myConst;
        myConst = 14;
        System.out.println(myConst);
        // byte, short int, long going 8, 16, 32, 64 bits
        //* Long data types must be specified with 'L' as in `long myLong = 15000000L`;

        //! Primitive data values have no attached methods (since they're not objects);

        final boolean myBool;
        myBool = true;
        System.out.println(myBool);

        final double myDouble;
        myDouble = 3.14d;
        System.out.println(myDouble);

        final float myFloat;
        myFloat = 3.14f;
        System.out.println(myFloat);
        //* A floating point number can also be a scientific number with an "e" to indicate the power of 10;
        //* 'E' for doubles;

        final char myChar;
        myChar = 'D';
        System.out.println(myChar);

        final String myVarChar;
        myVarChar = "Initial";
        System.out.println(myVarChar);
        //! String is the only non-primitive data type built-in to Java

        System.out.println(myVarChar + " " + myChar);
        //! To declare more than one variable of the same type, use a comma-separated list;

        
        
        //todo Type Casting
        //* Widening Casting (automatically) - smaller type to a larger type size
        //* Narrowing Casting (manually) - converting a larger type to a smaller size type
        double myCast = 3.14;
        int myProduct = (int) myCast;
        System.out.println(myProduct);     
        
        // Display Hello world! on the console
        System.out.println("Hello world");
    }
}