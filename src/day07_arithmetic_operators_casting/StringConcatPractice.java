package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("java " + 5 + 3); //java53
        System.out.println("java" + (5 + 3)); //java8
        System.out.println(5 + 3 + "java");//8java
        System.out.println(5 + (3 + "java"));//53java

        System.out.println("hello " + 1+2+3);//hello 123
        System.out.println("hello " + (1+2+3));//hello 6
        String str1 ="hello ";
        String str2 = "Friends ";
        System.out.println(str1+str2);
        System.out.println(str1 +" "+ str2 );

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);// 15
        System.out.println(num2-num1);// subtract  8-7=1
        System.out.println(num1 + " " +num2);//78
        System.out.println(num1+""+num2);

        char char1 = 'a';//a--->97
        char char2 = 'b';//b--->21
        System.out.println(char1 + char2);
        System.out.println(char1 + "" +char2);//ab





    }
}
