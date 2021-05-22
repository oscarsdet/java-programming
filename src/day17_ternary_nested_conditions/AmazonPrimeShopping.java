package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {

        int itemPrice = 195;
        boolean isPrimeMember = false;

        if (isPrimeMember) {
            System.out.println("free 2 day free shipping eligible");
        } else {
            if (itemPrice >= 25.0){
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping fee is $10");
            }
        }
        /**
         * PSEUDOCODE: CODE WRITTEN IN HUMA LANGUAGE. THEN IT WILL BE TRANSLATED TO JAVA
         * OR OTHER PROGRAMMING LANGUAGE
         *
         */
        // TODO: 3/16/2021  make another example on your own please .
    }
}
