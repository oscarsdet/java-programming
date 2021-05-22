package homework.Loops_04_04_2021;

/**
 * [IQ] UniqueFromList characters
 * Given a String, find and print the unique characters. A character is
 * unique if it only appears once in the String.
 * Ex:
 * AAABCCDEEF
 * Output:
 * BDF
 */
public class IQUniqueCharacters {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";
        String unique = "";
        for (int i = 0; i <word.length(); i++){
            int count = 0;
            for (int x = 0; x < word.length(); x++){
                if (word.charAt(i) == word.charAt(x)){
                    count++;
                }
            }
            if (count== 1){
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
