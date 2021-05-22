package day15_logicalOps_switch_ternary;

import java.util.Optional;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = ("Coffee");

        // if (onsale == true && freeShepping  == true)

        if (onSale && freeShipping) {
            System.out.println(" adding to shopping cart - " + itemName);
        } else {
            System.out.println("continue shopping for good deals on - " + itemName);
        }
        // add to cart only when it is freeShipping, onsale and itemName
     if (freeShipping && onSale && itemName.equals("Coffee")) {
         System.out.println(" adding to cart -" + itemName);
     } else {
         System.out.println("Continue Shopping for good deal on - " + itemName);
     }
     // location, salary, remote, benefits
     }
    }