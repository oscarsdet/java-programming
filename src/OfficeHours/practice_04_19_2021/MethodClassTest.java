package OfficeHours.practice_04_19_2021;

public class MethodClassTest {
    public static void main(String[] args) {
        MethodClass.methodOne();// this is void method and does print
        MethodClass.methodTwo(); //this returning a value
        System.out.println(MethodClass.methodTwo());
        String s = MethodClass.methodTwo();

        String s2 = "words";
        System.out.println(MethodClass.methodThree(s2));

    }
}
