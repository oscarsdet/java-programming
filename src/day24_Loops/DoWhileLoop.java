package day24_Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter =100;
        do{
            System.out.println("counter = " + counter);
            counter+=100;
        }while (counter<= 1000);
    }
}
