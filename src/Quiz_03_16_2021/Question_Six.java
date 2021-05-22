package Quiz_03_16_2021;

/**
 * QUESTION SIX
 * What's the result of the following code fragment?
 */
public class Question_Six {
    public static void main(String[] args) {
        char grade= 'A';
        boolean passed = grade == 'A'  || grade == 'B';
        boolean passed2 = grade == 'C' || grade == 'D';

        if (passed || passed2) {
            System.out.println("You've passed the exam");
        }else {
            System.out.println("you failed");
        }
        // I got this answer wrong (you failed)
        // the right answer was (YOU'VE PASSED THE EXAM)
    }
}
