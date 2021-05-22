package homework.Loops_04_04_2021;
/*
Camel Case
Given a String of words that follow Camel Case convention. Find and
print how many words are in the given String.
Every word, except the first word, begin with an uppercase letter. The
other characters of the word will be lowercase
Ex:
Input: thisHasManyWordsToFind
Output: 6
 */
public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";
        int firstWord =1;
        int words = 1; // value 1 because first word sarts with lowercase by default.
        for (int i = 0; i <= str.length()-1; i++){
            char firstLetterUpper = str.charAt(i);
            if (firstLetterUpper >= 'A' && firstLetterUpper <= 'Z'){
                words += 1;
            }
        }
        System.out.println(words);
    }
}
