package day24_Loops;
/**
 * a b c d e ... z
 * z ... a
 */
public class alphabet {
    public static void main(String[] args) {
        char letter = 'a';
//        System.out.println("letter = " + letter);
//        letter++;
//        System.out.println("letter = " + letter);
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        //print alphabet reverse order
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;

        }
    }
}