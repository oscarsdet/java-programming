package day15_logicalOps_switch_ternary;

import javax.lang.model.SourceVersion;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
        int age = 20;
        // check if age is not more than 5. print " need to  sit in child car seat.
        if (!(age > 7)) {
            System.out.println("must sit on child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }
        boolean isSmokingAllowed = false;// yes -> true no-> false
        //if smoing is not allowed : print smoking isnokin is not allowed here . exit
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here.  Exit");
        } else {
            System.out.println("This erea is for smoking");
        }

        boolean isAffordable = false;
        // if its NOT Affordable then print " Item Not affordable"
        if (!isAffordable) {
            System.out.println("Item is Not affordable");
        }
        String env = "qa ";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA Testing");
        }
        String carModel = "Tesla";
        // if its not Tesla, print "Not Interested."
      if (!carModel.equals("Tesla")) {
          System.out.println(" Not Interested.");
      }
      String secretePassword = "abc123";
      String inputPasswrod = "abc321";
      // if inputPassword IS NOT equals secretPasswrod  print " incorrect password"
      if (!inputPasswrod.equals("abc123")) {
          System.out.println("incorrect password");
      }
      if (!inputPasswrod.equals(secretePassword)){
          System.out.println(" Incorrect Passwrod");
      }
      if (!inputPasswrod.equals("abc123")) {
          System.out.println(" Correct passwrod");
      }else {
          System.out.println("In correct password");
      }
    }
}