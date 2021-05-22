package day15_logicalOps_switch_ternary;

import java.util.SortedMap;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'd';

        if (grade == 'A' || grade == 'b' || grade == 'C'){
            System.out.println("Passed with  " + grade);
        }else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade  - " + grade);
        } else if (grade == 'E'){
            System.out.println("Fail. - " + grade);
        }else{
            System.out.println("Invalid Grade. - " + grade);
        }
        /*
         if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("Passed with  " + grade);
        }else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade  - " + grade);
        } else if (grade == 'E'){
            System.out.println("Fail. - " + grade);
        }else{
            System.out.println("Invalid Grade. - " + grade);
         */

    }
}
