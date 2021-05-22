package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        //        PRIMITIVE CASTING:
//        PRIMITIVE CONVERSATION:
//        the above line will show error, because int is lager data type than ite. Even though the value is only 4.
//        In order to make it work/ we need to CAST it.
//
//
//        int n1 = 4;
//        byte b1 = (byte)n1;
//        short number
//        Now, the above line (byte)n1 will CAST/CONVERT n1 to BYTE. then assign the value.
//        byte b2 = 55;
//        int n2 = b2;
//        The above statement will work fine,, since byte is smaller data tpe than int. It will AUTOMATICALLY CAST.

        int num1 = 100;
        byte b1 = (byte) num1;
        short shNum1 = (short)num1;
        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum1);
//        todo: continue more practice on Casting



    }
}
