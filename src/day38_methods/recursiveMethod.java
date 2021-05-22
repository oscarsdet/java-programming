package day38_methods;

public class recursiveMethod {
    public static void main(String[] args) {
        printNums(1);

    }
    public static void printNums(int nums){
        System.out.print(nums + " ");
        nums++;
        if (nums <= 100){
            printNums(nums);
        }
    }
}
