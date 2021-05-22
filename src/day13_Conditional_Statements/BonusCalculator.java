package day13_Conditional_Statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.00;
        double salesAmount = 2500.0;
        if (salesAmount <= 1000) {
            System.out.println("Good Job, you qualified for bonus!");
            bonus = 50.0; // conditional value assignment
        } else {
            System.out.println("Great job you qualified for for full bonus");
            bonus = 100.00;
        }
        System.out.println("your tatal bonus : $ " + bonus);
    }
}
//auto format shortcut in intellij mac command  option + L Windows Control + alt + shift + L