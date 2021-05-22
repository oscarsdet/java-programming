package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 456);
        System.out.println("nums = " + nums);
        // nums.add(100) .UnsupportedOperationException
        // nums.remove(0)  .UnsupportedOperationException
        //   nums.clear(); .UnsupportedOperationException
        // workArround" List<Integer> nums = new ArrayList (arrays.asList(23, 1, 34, 54);

        List<Integer> numsList = new ArrayList<>(Arrays.asList(2, 423, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0 );
        numsList.remove(new Integer(5344));
        System.out.println("numList = " + numsList);
        /**
         * List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
         * int caffeineAmount = 0;
         * String drink = "monster";
         *
         * monster, rebull, celsius:
         * caffeineAmount= 150
         * coffee, kambucha:
         * caffeineAmount = 112
         *
         * tea, coke, pepsi, mdew
         * caffeineAmount= 35
         *
         */

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea", "monster"
        ,"red bull", "coke", "pepsi","mdew","kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount =0;

        for (String drink : drinksWithCaffeine){
            if (drink.equals("monster")|| drink.equals("red bull")|| drink.equals("celsius")){
                caffeineAmount=150;
                System.out.println(drink+ "--->"+caffeineAmount);
            }else if (drink.equals("coffe")|| drink.equals("kambucha")){
                caffeineAmount =112;
                System.out.println(drink +"--> "+ caffeineAmount );
            }else if(drink.equals("tea")|| drink.equals("coke")|| drink.equals("persi")|| drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink+ "--->"+ caffeineAmount);



            }
        }
        for(String drink : drinksWithCaffeine){
            switch (drink){
                    case"monster":
                    case "red bull":
                    case "celsius":
                    caffeineAmount =150;
                    System.out.println(drink + "--> "+ caffeineAmount);
                    case "coffe":
                    case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + "--> " + caffeineAmount);
                case "tea":
                    case "coke": case "persi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + "-->" + caffeineAmount);
                    break;
            }
        }
        drinksWithCaffeine.forEach(drink-> System.out.println(drink.toUpperCase(Locale.ROOT)));
        drinksWithCaffeine.forEach(each-> {
            System.out.println("________________");
            System.out.println("each = " + each);
            System.out.println("__________________");
        });
    }
}
