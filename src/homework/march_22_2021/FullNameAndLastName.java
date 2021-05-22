package homework.march_22_2021;

/**
 * Given two String variables. One is a full name and the second a last name. Check if the full name has the same last name as the other String.
 *     Ex:
 *         s: "james bond"
 *         s: "bond"
 *         output: Same last name
 *
 *         s: "alex benji"
 *         s: "bond"
 *         output: Not the same last name
 */
public class FullNameAndLastName {
    public static void main(String[] args) {
        String fullName = "james bond";
        String lastName = "bond";

        if (fullName.contains("bond") && lastName.contains("bond")) {
            System.out.println("same last name");
        } else {
            System.out.println("not the same last name");
        }
    }
}
