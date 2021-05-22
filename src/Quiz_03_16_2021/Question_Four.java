package Quiz_03_16_2021;

public class Question_Four {
    public static void main(String[] args) {


        /**
         * What's the output of the following code fragment?
         */

        boolean x = true;
        boolean y = !x == false; //NOTE this variable boolean y = !x == false; is falls so x, y, and z has to print..!!
        boolean z = y;

        if (x){
            System.out.println("Hello Everyone");
        }
        if (y) {
            System.out.println("Today is a great Day");
        }
        if (z)  {
            System.out.println("We are Improving everyday");
        }

/**
 * I answered wrong (we are improving everyday )
 */
    }
}
