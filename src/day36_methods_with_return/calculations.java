package day36_methods_with_return;

public class calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " +calculator.add(10,45));
        System.out.println("100 - 40 = "+ calculator.minus(100,40));
        System.out.println("55 / 4 = " + calculator.divide(55,4));
        System.out.println("10 * 2 = " + calculator.multiply(10, 2));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = calculator.minus(d1,d2);
        System.out.println("result = " + result);


    }
}
