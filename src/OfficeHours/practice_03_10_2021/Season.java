package OfficeHours.practice_03_10_2021;
/*
[Season & Day length]

The seasons will determine how long each day and night are.
The season will be determined by a number:

> 1 - Spring
day: 14
night: 10
> 2 - Summer
day: 16
night: 8
> 3- Fall
day: 14
night: 10
> 4 - Winter
day: 12
night: 12

 */
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seasons number: \n1-Spring\n2-summer\n3-fall\n4-winter");
        int season = scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName =  "";


        if(season == 1) {
          day = 14;
          night = 10;
          seasonName = "Sprint";
        }

        if(season == 2){
            day = 16;
            night = 8;
            seasonName = "summer";
        }

        if(season == 3){
            day = 14;
            night = 10;
            seasonName = "fall";
        }

        if(season == 4){
            day = 12;
            night = 12;
            seasonName = "winter";
        }
        System.out.println("in " + seasonName + " there is " + day + " Hours of dayLight and " + night + " hours of night time ");


    }
}
