package day26_Loops;
/*
String word = "java";
char letter = 'a';
int count = 0;

For loop: read each character(charAt(i))
and test if it matches letter.
if true:
    add 1 to count


OUTSIDE:
print the count

 */

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("There are " + count + " " + letter +"'s in " + word);

            }


        }