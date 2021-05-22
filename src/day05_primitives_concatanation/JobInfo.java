package day05_primitives_concatanation;

import javax.sql.rowset.spi.SyncProvider;

public class JobInfo {
    public static void main(String[] args) {
        String title = "java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Java Selenium, Cucumber, JUnit Tester";
        double salary = 123000 ;
        byte yearsOfexp = 10;
        boolean hasBenefits = true;
        System.out.println("title: " + title);
        System.out.println("company: " + company);
        System.out.println("job description: " + jobDescription);
        System.out.println("salary: $" +salary);
        System.out.println("years of Experience: " +  yearsOfexp);

//        System.out.println("title");
//        System.out.println("company");
//        System.out.println("jobDiscription");
//        System.out.println("salary");
//        System.out.println("yearsExp");
//        System.out.println("hasBenefits");
//        System.out.println("***** print long form in one line***");
//        System.out.println(title+ "\n" +company+ "\n" +jobDescription+ "\n" +salary+ "\n"+yearsExp+ "\n"+ hasBenefits);
//    System.out.println("");



    }
}