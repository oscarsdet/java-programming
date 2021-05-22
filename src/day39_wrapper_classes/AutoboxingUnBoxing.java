package day39_wrapper_classes;

public class AutoboxingUnBoxing {
    public static void main(String[] args) {
        // autoboxing : Primitive > wrapper class object
        int num1 = 500;
        //      box          primitive
        Integer num2 = num1;
        Integer num3 = 124;

        // Un-boxing:  object > primitives

        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3);


    }
}
