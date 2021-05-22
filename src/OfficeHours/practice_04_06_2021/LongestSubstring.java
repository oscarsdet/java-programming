package OfficeHours.practice_04_06_2021;
/*
Biggest Substring of matching characters
Gien a String find the biggest substring of chars that match adn print it.
EX: aaabbbcccccddddee output ccccc
 */
public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeeeeeee";
        String longestSubstring = "";
        String temp = "";  //

        for(int i=0; i < str.length()-1; i++) {

            temp += str.charAt(i); //

            if(str.charAt(i) != str.charAt(i + 1) || i == str.length()-2){

                if(i == str.length()-2 && str.charAt(i) == str.charAt(i + 1)){
                    temp += str.charAt(i+1);
                }
                /* The reason I did i == str.length()-2 in the statement is so the characters are only checked
                   in the 2nd to last index. In other iterations the str.charAt(i) == str.charAt(i + 1))                          part won't be checked
                */
                if(temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }

                temp = "";

            }
        }

        System.out.println("Longest substring: "+ longestSubstring);

    }
}
