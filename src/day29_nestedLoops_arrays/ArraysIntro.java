package day29_nestedLoops_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 0; //  single variable
        int[] nums = new int[3]; // array variable this is the longest way
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        // print values of array
        System.out.println("value at index 0 = " + nums[0]);//  index 0
        System.out.println("value at index 1 = " + nums[1]);//  index 0
        System.out.println("value at index 2 = " + nums[2]);//  index 0
        // how to find out the size of the array
        System.out.println("number of ellements = " +nums.length);
        //store length of array intto len variable
        int len = nums.length;
        System.out.println("len = " + len);
        // can we change values in the array?:
        nums[0] =  100;
        nums[1] = 300;
        nums[2] = nums[1];//read the value of index 1 and assign sae to index 2
        System.out.println("nums[0} = " + nums[0]);
        System.out.println("nums[1} = " + nums[1]);
        System.out.println("nums[2} = " + nums[2]);






        // we can use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]);//10



//        String[] day = new Array[7];
//        Days[0] = "Sunday";
//        Days[1] = "Monday";
//        Days[2] = "Tuesday";
//        Days[3] = "Wednesday";
//        Days[4] = "Thursday";
//        Days[5] = "Friday";
//        Days[6] = "Saturday";

//        int[] numbers = new int [100];
//        for (i= 0; i<100; i++){
//            numbers[i]= (int)(Match.random() *  100)+1;
        }

    }

