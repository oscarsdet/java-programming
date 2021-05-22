package day17_ternary_nested_conditions;

public class TeslaPrice {
    public static void main(String[] args) {
        char modelSeection = 'S';
        String trim = "Long Range";


        if (modelSeection == 's') {
            System.out.println("Model S Selected");
        }if (trim.equals("Long Range")){
           System.out.println("Long Range Selected :\n range is 412\nSpeed is 155 mph\nAcceleration is 60-3.1 sec");
        }else if (trim.equals("Plaidd")) {
            System.out.println("Plaid Moddel is is Selected");
            System.out.println(" range is 390\n Speed is 200 mph\n Acceleration is 60-1.99 sec ");
        }else if (trim.equals("Plaid +")){
            System.out.println("Plaid + model is selected");
            System.out.println(" Range is 520\n Speed is 200 mph\n Acceleration is 60-1.99 sec ");
        }else{
            System.out.println("It is not what you are looking for");
        }
    } // todo finish it
}