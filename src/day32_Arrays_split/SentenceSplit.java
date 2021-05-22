package day32_Arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st Word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);
      //  System.out.println("4th word = " + words[3]); ArrayIndexOutBoundException

        System.out.println("___loop___");
        for (String  w : words){
            System.out.println(w);
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] resultInArray = googleResult.split(" ");
        System.out.println("count = " + resultInArray[1]);
        System.out.println("second = "+resultInArray[3].replace("(", ""));
        System.out.println("seconds = "+ resultInArray[3].substring(1));

    }
}
