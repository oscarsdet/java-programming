package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {

        int[] nums = {100,5,1,7,0,-4,44,33};
        // print all nums in same line
        System.out.println(Arrays.toString(nums));
        // sort nums.re-arrange values
        Arrays.sort(nums);
        //prin after sorting
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: " +nums[0]);
        System.out.println("max value: " +nums[nums.length-1]);
       // Arrays.sort(nums, Collection.reverseOrder()); this way does not work with primitives types arrays. only objects type

        String[] words = {"java", "c#","c++", "Kotlin", "Python", "Ruby", "Asembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" +String.join(", ",  words )+"]");
        // sort word in alphabetic and ASCI order
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, Collections.reverseOrder());






    }
}
