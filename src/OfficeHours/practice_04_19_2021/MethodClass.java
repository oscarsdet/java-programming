package OfficeHours.practice_04_19_2021;

public class MethodClass {

          /*
    void-> run a block of code, there is no return value
           Arrays.sort() -> takes an array, sorts it, doesn't return anything

           -> return -> runs a block fo code, but there is a return value
               Arrays.binarySearch() -> takes an array and  element, tires to find the element, returns the index of the element

     */
          public static void main(String[] args) {

          }
          public static void methodOne(){
              System.out.println("one");
    }
    public static String methodTwo(){
              return "two";
    }
    public static int methodThree(String word){
              return word.length();

    }
    public static boolean login(String usernaem, String passrod){
              return true;
    }
}
