package day30_Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
         /*
        FOR EACH LOOP: is used with collections of data in java, we can use for each loop with arrays,
        arraylists, maps, sets, or any other colletions/datar sructures.
        FOR LOOPs works ONLY with Collection of data.
        int nums[] = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), };
        */
//                    0    1   2   3     4   5    6    7    8   9
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNum :  data){
            System.out.println(eachNum);
        }
        for (int n : data){
            System.out.print(n + " ");
        }
        System.out.println("---------FOR LOOP-------------");
        /*
        repeat above with for loop
         */
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        // print last value in aray index without using length
        //                        10 - 1 = 9
        System.out.println("last value: " +data[data.length - 1]);

        System.out.println("Reverse Array");
        //                              > -1 also is good
        for (int i = data.length -1;  i >= 0; i--) {
            System.out.print(data[i] + " ");


        }
    }
}
