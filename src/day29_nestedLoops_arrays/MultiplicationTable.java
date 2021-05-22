package day29_nestedLoops_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer =  1; outer <= 10; outer++){
            for (int inner = 1; inner <= 10; inner++){
                System.out.print(outer * inner+"\t");
            }
            System.out.println();
        }
        for (int row =1; row <= 3; row++){
            for (int col = 1; col <= 4; col++){
                System.out.println(row + "|" + col);
            }
        }
        String word = "java";
        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j <= i; j++){
                System.out.println(word.charAt(j));
            }
            System.out.println();
        }
    }
}
