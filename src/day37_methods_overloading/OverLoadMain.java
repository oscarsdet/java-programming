package day37_methods_overloading;

import java.util.Arrays;

public class OverLoadMain {
    public static void main(String[] args) { // you can change ars for nay name doesn't matter

        System.out.println("Hello From Real main methods");
        main(10);
        Arrays.toString(args);
        System.out.println(Arrays.toString(args));

    }

    /**
     *overloading main method: same name  + different parameter KDK dos not look for this one to run
     */
    public static void main(int num){
        System.out.println("num = " + num);
    }

}
