package homework.ArrayPractice_1;
/*
Max and Min number from Array•Write a program that can find the maximum number from any given int array•
Write a program that can find the minimum number from any given int array
 */
public class MaxAndMinNumberFromArray {
    public static void main(String[] args) {
        int[] numbers = {12, 1, 99, 22,45,66,222,8,4,7};
        int max = numbers[0];
        int min = numbers[0];

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > max){
                max=numbers[i];
            }

            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("max number: " + max);
        System.out.println("min number: " + min);
    }
}
