package OfficeHours.Practice_04_07_2021;
/*
[IQ] Duplicate characters
Given a String, find and print the duplicate characters. A character is
duplicate if it appears more than once in the String.
Ex:
AAABCCDEEF
Output:
ACE
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";

        for(int i=0; i<str.length(); i++){
            int count = 0;

            if(checked.contains("" + str.charAt(i))) {
                continue;
            }
            for (int j=0; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){//A==A
                                                    //A==B
                                                   //A==C
                                                   //A==c til the end
                    count++;

                }
            }
            if (count >1){
                System.out.println(str.charAt(i)+ " is Duplicate");
            }
            checked += str.charAt(i);
        }

    }
}
