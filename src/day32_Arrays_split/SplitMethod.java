package day32_Arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {

        //               0    1       2       3
        String words = "java:python:selenium:html";
        String[] wordsArray= words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " +  wordsArray.length);


        System.out.println("______________for each loop____________________");
        for(String each :wordsArray ) {
            System.out.println(each);

        }
        String sentence = "Today I am coding java arrays";
        System.out.println(Arrays.toString(wordsArray));
       String[] wordsInSentence = sentence.split(" ");
        System.out.println("First word: " +wordsInSentence[0]);
        System.out.println("First Word: " +sentence.split(" ")[0]); // also can be done this way
        System.out.println("number of words in sentences = " + wordsInSentence.length);

        System.out.println("___ each word in each line____for each loop________");
        for (String each :wordsInSentence){
            System.out.println(each);
        }



    }
}
