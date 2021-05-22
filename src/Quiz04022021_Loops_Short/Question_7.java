package Quiz04022021_Loops_Short;

/**
 * What;s  the result of the following code fragment?
 */
public class Question_7 {
    public static void main(String[] args) {
        int z = 5;
        for (int i=5; i > 0; i--) {
            z += i;
        }
        System.out.println(z);
    }
    /**
     * 15
     * 20 (correct)
     * Compile Error
     * 10
     */
}
