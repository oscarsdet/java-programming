package day12_conditional_statements;

public class ifElseStatement {
    public static void main(String[] args) {
        if(10 > 5) {
            System.out.println("condition is true");

        }else{
            System.out.println("condition is false");
        }

        int count = 25;
        //check if count is more than 30. if yes, print "count is nore tan 30"
        // otherwise print " count is lees than"
        if(count > 30) {// false
            System.out.println("caount is more than 30");

        }else {
            System.out.println("count is less tan 30");
        }

        byte age = 14;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println(" Age is Greater or equal to 18");

        }else{
            System.out.println(" Not Eligible to vote");
            System.out.println("Age is less than 18");

        }



        }

    }
