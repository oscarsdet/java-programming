package day42_Arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a','i', 's','f', 'u','n'));
        System.out.println("Size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("Reversed = "+ letters);
// find count of a in letters
        System.out.println( Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char  = " + Collections.max(letters));
        System.out.println("Min char = " +  Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceall = " + letters);

        List<Integer> nums = Arrays.asList(23,1,43, 5,234,7,-9,0, 1,5,5,5,5);
        Collections.reverse(nums);
        System.out.println("nums after reverse = "+ nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOffives = Collections.frequency(nums, 5);
        System.out.println("countOffives = " + countOffives);

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOffives);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("After replaceall = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " +  nums);

        Collections.shuffle(nums);
        System.out.println("countOf1s = " + nums);










    }
}
