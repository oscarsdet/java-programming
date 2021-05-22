package day41_arrayList;

import java.util.ArrayList;

public class citiesList {
    public static void main(String[] args) {
        //declare arraylist. alt/option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC"); //0
        cities.add("New York"); //1
        cities.add("Vienna"); //2
        cities.add("Adana"); //3
        cities.add("LA");    //4
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size +" cities in the list");

        //for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();
        //for each loop
        for(String city : cities) {
            System.out.print(city +" ");
        }

        //delete item from arraylist

    }
}