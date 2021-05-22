package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args) {
//        byte>short>int>long
//        float>double
//        char
//        boolean
        byte byteValue = 100;
        System.out.println(byteValue);
        short shortValue = 32767;
        System.out.println(shortValue);
        int intValue = 2147483647;
        System.out.println(intValue);
//        long variable value---> we put L at the end. to clearly tell java; that is is long number.
//        if we dont put L, java might think it is int value
        long longValue = 9223372036854775804l;
        System.out.println(longValue);
//        ***** DECIMAL NUMBERSFLOATRING POINT TYPES********

        float floatValue = 1.40239846F;
        System.out.println(floatValue);
//        float variable value

        double doubleValue = 4.940656458412465E44;
        System.out.println(doubleValue);
//double doubleValue = 4.94065645841246544D; also valid

//***** character Type******
        char charValue = 'a';
        System.out.println(charValue);


//***BOOLEAN**** = TRUE/FALSE*******
        boolean booleanValue = true;
        System.out.println(booleanValue);

//        also you can print this way
//       System.out.println(byteValue);
//        System.out.println(shortValue);
//        System.out.println(intValue);
//        System.out.println(longValue);
//        System.out.println(floatValue);
//        System.out.println(doubleValue);
//        System.out.println(charValue);
//        System.out.println(booleanValue);

    }
}