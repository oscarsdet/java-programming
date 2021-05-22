package day10_shorthand_Operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i =1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);
        int lineOfCode =15;
        System.out.println("lineOfCode = " + lineOfCode);
        // increase lineOFCode by 1 ; 4 different ways that we leaned today
        lineOfCode = lineOfCode +1;
        lineOfCode +=1;
        lineOfCode++;
        ++lineOfCode;
        System.out.println("lineOfCode = " + lineOfCode);

        lineOfCode = lineOfCode -=1;
        lineOfCode -=1;
        lineOfCode--;
        --lineOfCode;
        System.out.println("lineOfCode = " + lineOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--; letter--; letter--;
        System.out.println("letter = " + letter);


//        count ++; ;// <-- add 1 to the count value
//        System.out.println(count);

        /*count++; eac time adds 1 to the variable value.


        int num = 10;
        num = num +1;
        num++;
        ++num;
        all of those statements above are adding 1 to the value of num.

         */


    }
}
