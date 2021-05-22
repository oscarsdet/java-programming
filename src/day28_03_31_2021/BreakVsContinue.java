package day28_03_31_2021;

public class BreakVsContinue {
    public static void main(String[] args) {
        //break statment
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3)
                break;
        }

        for (int i = 1; i <= 5; i++) {
            if(i == 2 || i == 4){
                continue;//goto next iteration. skip the code below
            }
            System.out.println(i);
        }
    }
}


