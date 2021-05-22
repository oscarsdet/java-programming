package day37_methods_overloading;

public class VArArgs {
    public static void main(String[] args) {
addNumbers(10, 5);
addNumbers(100, 200, 300);
addNumbers(23, 45,23, 54, 45, 3, 35, 4, 6, 556, 3,4, 23,35,456,3,45,6,34,2,45,6,7,34,234,54,34);
addNumbers();
    }
    public static void addNumbers( int ... nums){
        // inside the method, is is used as regular array
       int sum = 0;
       for (int n : nums){
           sum +=n;
           System.out.println("sum = " + sum);
       }
    }
}
