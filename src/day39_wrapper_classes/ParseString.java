package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "125";
        int count = Integer.parseInt(total);
        System.out.println(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        Double price = Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println("Expensive");
        }
        String sentence = "I worete 100 lines of code";
        // split by space, parse index 2 to int
        
        String [] words  = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
        
        


    }
}
