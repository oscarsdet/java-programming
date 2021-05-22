package Quiz04022021_Loops_Short;
/*
what's the result of the following code fragment?
NOTE: The update portion can have any code to update your value. In this case the i is incremented by 2 each iteration
 */
public class Question_4 {
    public static void main(String[] args) {
        int j = 7;
        for (int i = 0; i < j-1; i +=2){
            System.out.println(i + " ");
        }
        /*
        infinite loop (answered)
        0 2 4 6
        2 4
        0 2 4 (correct)
         */
    }
}
