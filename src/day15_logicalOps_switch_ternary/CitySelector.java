package day15_logicalOps_switch_ternary;


public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        // Moscow or Tempa
        if (city.equals("Moscow") && city.equals("Tampa")) {
            System.out.println("I am willing to relocate " + city);
        } else {
            System.out.println("am not considering  -  " + city);
        }
        // Saim OR Murodil -> it is a java class with Saim
        // otherwise --> Soft skill class with Nadir
        String  teacher = "Morudil";
        if (teacher.equals("Saim") || teacher.equals("Morudil")) {
            System.out.println("it is a java class with " + teacher);
        } else {
            System.out.println("Soft Skill with " + teacher);
        }
        /*
        1- teacher Saim or Murodil -> It is a java Class
        2- teacher Nadir -> Soft Skill Class with
        3- any other teacher -> some class with Gurhan/akbar

         */
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("Java class with  " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft Skill Class with  " + teacher);
        }else {
            System.out.println("Some Class with " + teacher);
        }

        /*
        Company - "Google", Salary >=100k
         */
        String Company = "NadirTech";
        double salary = 105_000.0;
        if(Company.equals("Google") || salary >= 100_000){
            System.out.println("Accepting offer from " + Company);
        } else {
            System.out.println("Rejeting offe from " + Company);
        }

    }

}
