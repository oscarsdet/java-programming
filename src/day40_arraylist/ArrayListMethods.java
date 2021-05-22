package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList);
        System.out.println("isEmpty? + " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to the mall ");

        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("Wooden spoon");
        shoppingList.add("Scooter");
        shoppingList.add("java book");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        shoppingList.add("Gun");

        if (shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to the mall ");

        }
        int count = shoppingList.size();
        System.out.println("Items to buy + " + count);

        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));

        if (shoppingList.contains("shoes")){
            System.out.println("I got shoes");

            }else{
            System.out.println(" shoes are not in  the list");
        }
        System.out.println("buying shoes .... #88");

        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);

        System.out.println("Done shopoin g, get bak to coding ");
        shoppingList.clear(); // clear the list , remove all items







    }
    List<String> shoppingList = new ArrayList<>();


}
