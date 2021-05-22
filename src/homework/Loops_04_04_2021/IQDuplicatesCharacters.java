package homework.Loops_04_04_2021;

/**
 * [IQ] Duplicate characters
 * Given a String, find and print the duplicate characters. A character is
 * duplicate if it appears more than once in the String.
 * Ex:
 * AAABCCDEEF
 * Output:
 * ACE
 */
public class IQDuplicatesCharacters {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";
        int count = 0;
        String duplicates ="";
        for (int i = 0; i < word.length(); i++){
            for (int j = i + 1; j< word.length(); j++){
                if (!duplicates.contains(word.charAt(j) + "")){
                    duplicates += word.charAt(i);
                    break;
                }
                System.out.println("j = " + i);
            }
        }
    }
}

