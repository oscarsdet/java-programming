package homework.ArrayPractice_1;
/*
00numberarray1.Create an int array called numbers that has length of 1002.Assign 1-100 to each index of the array.
Then use a for each loop to print out all the elements of the array
 */
public class NumberArray {
    public static void main(String[] args) {
        int[] number = new int[100];

        for(int i = 0; i <number.length; i++){
            number[i] = i+1;
        }

        for(int eachNumber : number){
            System.out.println(eachNumber);
        }
    }
}

