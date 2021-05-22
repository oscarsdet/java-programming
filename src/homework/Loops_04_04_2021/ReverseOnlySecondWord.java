package homework.Loops_04_04_2021;
/*
Reverse only second word
Given a String with three words separated by spaces. Reverse only the
second word and return the modified String
Ex:
I love java
I evol java
 */
public class ReverseOnlySecondWord {
    public static void main(String[] args) {

        String str = "I evol java";
        String word = str.substring(str.indexOf(" ")+1 , str.lastIndexOf(" "));
        String reversed = "";
        for (int i = word.length() -1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        System.out.println(str.replace(word, reversed));
    }
    }
