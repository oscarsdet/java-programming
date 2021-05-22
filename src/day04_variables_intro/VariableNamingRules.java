package day04_variables_intro;

public class VariableNamingRules{
    public static void main(String[] args){
        //int static=22 ---> error, static is reserved by java
        int static2=22;
        int _static=23;
        int $static=45;
        int stacticVar=234;

        int $salary=55;
        //int 1stMonthSalary=3000-->cannot start with number, but can end with number
        //$=10--> is allowed but not recommended
        //int _=3; ---> is allowed but not recommended
        //java naming conversations:
        //packages=>all lowercase-day04_variables
        //classnames ===> start with uppercase, rest camelcase

    }
}