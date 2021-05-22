package Quiz_03_16_2021;

public class Question_Seven {
    public static void main(String[] args) {
        /**
         * What's the result of the following code fragment?
         */
        int num = 9;
        if(num++ ==10) { // line 1
            System.out.println("hello world  " + num); //line 2
        }
        else {
            //line 3
            System.out.println("hello Universe " + num );
        }
// goto this one  (Hello Universe 10)
    }
}
