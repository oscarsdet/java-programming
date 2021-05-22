package day46;

public class Car {
    // encapsulated/ hidden instance variables
    private String model;
    private int year;
    private double mileage;


    // setter method for model
    public void setModel(String carModel){
        model = carModel;

    }
    //getter method for model


    public String getModel() {
        return model;
    }
    //setter for year
    public void setYear(int year){
        this.year = year;
    }
    //getter for year
    public int getYear(){
        return year;
    }
    //getter setter for mileage
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    // generate toSTring
    public double getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
