package day31_arrays;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};//todo remove is from fun
        //print each letter  using a loop
        for (char each : letters) {
            System.out.println(each + " ");

        }
        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", " straverry"};
        //"bananas-apples-kiwi-mango-papaya-straverry
        String fruitsStr ="";
        for (String each : fruits){
            System.out.println(each + "-");
            fruitsStr += each + "-";

            System.out.println("\nfruitStr = "+ fruitsStr);
            String[] languages = {"java", "Python","c++", "sql", "ruby","javascript"};
            System.out.println(String.join("|",languages));
            System.out.println(String.join("##", languages));
            String JoinedLanguages = String.join(" <> ", languages);
            System.out.println("JoinedLanguages = " + JoinedLanguages);





        }


    }
}
