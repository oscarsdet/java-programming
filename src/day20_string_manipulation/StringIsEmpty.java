package day20_string_manipulation;

import java.sql.SQLOutput;

public class StringIsEmpty {
    public static void main(String[] args) {
        String car= "lexus";
        System.out.println(car.isEmpty());// false  - NOT empty

        String city = "";
        System.out.println(city.isEmpty());//true

        System.out.println(city.length() == 0); // true
        System.out.println(city.equals(""));// true
        System.out.println(city.equalsIgnoreCase(""));//true

        String JobTitle = "";
        System.out.println(JobTitle.isEmpty());
        System.out.println(JobTitle.length());
        System.out.println(JobTitle.length() == 0);

        if (JobTitle.isEmpty()){
            System.out.println("JobTitle is missing, resend");
        }else{
            System.out.println("job titel looks good");
        }
        if (JobTitle.length() == 0){
            System.out.println("jobtitel is empty");
        }else {
            System.out.println("job title is not empty");
        }
        System.out.println(JobTitle.endsWith(" "));
        if ("".equals(JobTitle));
        System.out.println("Job title is not empty");

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());//false
        if (!veggie.isEmpty()){
            System.out.println("we have carrots");
        }
       String word6 ="java";
        System.out.println(word6.contains("v"));//true
        System.out.println(word6.contains("va"));//true
        System.out.println(word6.contains("ja"));//true
        System.out.println(word6.contains("a"));//true
        System.out.println(word6.contains("jv"));//false
        System.out.println(word6.contains("Ja"));//false
    }
}
