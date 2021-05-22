package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));//true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("j"));

        if (company.contains("")) {
            System.out.println("miltiple words company name");
        } else {
            System.out.println("single word company name ");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        // check if " | " is in etsyTitle
        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass check passed");
        } else {
            System.out.println("fail - title check failed ");
        }
        String firstName = "Ahmed";
        // check if firstName contains "a"  adn "e" at same time.
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains ("i")){
            System.out.println("nor a or i is present");
        }
        String email = "oscar@bmecorp.us";
        //check email contains "@" end ends with ".us"
        if (email.contains("@") && email.endsWith(".us")){
            System.out.println("email is valid");

        }
        if (email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else {
            System.out.println("d is not present");
        }
    }
}
