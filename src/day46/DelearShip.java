package day46;

public class DelearShip {
    public static void main(String[] args) {
        Car car1 = new Car();
        //Error below, model and year are PRIVATE and cannot be accessed
        //car1.model = "Nissan Altima";
        //car1.price = 2020
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 = " + car1.getYear());

        car1.setMileage(8500);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);

        Car alphaRomeo = new Car();
        alphaRomeo.setModel("Alpha Romeo Giulia Ti AWD");
        alphaRomeo.setYear(2017);
        alphaRomeo.setMileage(16604);

        System.out.println("model = " + alphaRomeo.getModel());
        System.out.println("Year = " + alphaRomeo.getYear());
        System.out.println("Mileage = " + alphaRomeo.getMileage());
        System.out.println(alphaRomeo);
    }
}
