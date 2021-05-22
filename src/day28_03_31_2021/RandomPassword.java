package day28_03_31_2021;
import java.util.Random;
import java.util.Scanner;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 8; i++){
            int index = random.nextInt(71);//random num 0 -70
            System.out.print(source.charAt((index)));
            // source.substring(index, index +1);
            // add the cahr to pawwrod variable using +=
            // password = password + source.charAt (index);
            password += source.charAt(index);

        }
        System.out.println("\nyour password = " + password);
    }

}
