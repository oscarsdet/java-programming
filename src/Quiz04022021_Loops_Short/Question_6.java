package Quiz04022021_Loops_Short;
/*What;s the result of the follwing code fragment?*/
public class Question_6 {
    public static void main(String[] args) {
        for (int i=0; i <5; i--){
            System.out.println("hello cybertek");
        }
        /**
         * compile error
         * infinite loop (correct)
         * lopp does not run de to false condition
         * loop repeats the "hello cybertek" print statement 5 times
         */
    }
}
