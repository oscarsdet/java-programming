package Day27_Loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "gitghub";
        char letter = 'g';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            // System.out.println(n +" - " + word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter + " is found at index " + index);
                break; //exit for loop
            }
        }

        if (index == -1) {
            System.out.println(letter + " is not present");
        } else {
            System.out.println(letter + " is found at index " + index);
        }
    }
}


//todo practice this operation


        /**
         * String word = "github";
         * char letter = 'i';
         * int index = -1;
         *
         * using for loop:
         *     if charAt(i) matches letter
         *         store the i value into index
         *
         *
         * "i is found at index 1"
         */
//        word.indexOf("a");
//        word.indexOf("j");
//        word.indexOf("v");
//        word.indexOf("av");
//        word.indexOf("jv");
//        word.indexOf("jq");



