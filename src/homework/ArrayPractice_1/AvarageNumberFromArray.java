package homework.ArrayPractice_1;
/*
Average Number from ArrayGiven an int array calculate the average number-> Make it flexible so it will work with any array size Examples:[1,2,3] -> average: 2[10, 15, 5, 6]
-> average: 9[4, 5, 6, 7, 8, 10, 20, 30, 0]
 -> average: 10
 */
import java.util.Scanner;
public class AvarageNumberFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        double addition = 0;

        for(int i =0; i < temps.length; i++){
            addition += temps[i];
        }

        double process = addition/ (temps.length);
        System.out.println(process);



    }
}
