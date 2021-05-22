package day17_ternary_nested_conditions;

/**
 * TeslaNestedIf
 *
 * char model = 'S';
 * trim -> "Long range"
 *
 *
 * when model 'S'
 *     if trim is "long range":
 *
 *         "range: 412"
 *         "top speed: 155 mph"
 *         "0-60- 3.1sec"
 *
 *     if trim is "Plaid":
 *
 *         "range: 412"
 *         "top speed: 155 mph"
 *         "0-60- 3.1sec"
 *
 *     if trim is "Plaid+":
 *
 *         "range: 412"
 *         "top speed: 155 mph"
 *         "0-60- 3.1sec"
 * when model is '3'
 *     ....
 */
public class TeslaNested {

    public static void main(String[] args) {
        char model = 'S';
        String trim = "Plaid+";


        if (model == 'S') {
            System.out.println();
            if (trim == "Long Range") {
                System.out.println("Range Est: 412mi\ntop sppeed: 155mph\n0-60mph: 3.1sec");
            } else if (trim == "Plaid") {
                System.out.println("Range Est: 390mi\nTop Speed: 200mph\n0-60mi: 1.99se");
            } else if (trim == "Plaid+") {
                System.out.println("range Est: 520+mi\nTop Speed 200mph\n0-60mi:<1.99sec");
            } else {
                System.out.println("Standard Range Plus\nt263mi: Est Range\n140mi: Top Speed\n5.3se: 0-60mi");
                System.out.println("This model out of stock");
            }
        }
    }
}