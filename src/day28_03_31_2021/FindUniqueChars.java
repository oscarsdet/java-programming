package day28_03_31_2021;

/**
 *
 */
public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "javva";
        String unique = "";
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
            // if word.charAt(i) is not contains in unique
            // add to unique
            if (unique.contains(word.charAt(i)+"")) {
                continue;
            }
            unique += word.charAt(i);
        }
        System.out.println("UniqueFromList char is  " + unique);

        }
            }
