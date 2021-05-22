package homework.Loops_04_04_2021;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();

            shoppingListReport = shoppingListReport.concat("Item"+count+": "+item+" Price: "+price);
            count++;
            totalPrice = totalPrice+price;
            if(countinue.equals("yes")){
                shoppingListReport += ", ";
            }
        }while(count <= 10 && countinue.equals("yes") );
        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);
    }
}
