package day40b_ReviewClass;

/*
Coding task to practice with:
[Merge Strings]
User is given two Strings, which could vary in length, merge these Strings so these Strings are
combined into one String. Any extra characters from mismatched length String are at the end.
Ex:
String one = abc
String two = defgh
Output:
adbecfgh
Ex:
String one = java
String two = is
Output:
jiasva
_________________________
 */
public class MergeString {
    public static String mergeString(String one, String two){
        String merge = "";
        String bigger = "";
        int minlength = 0;


        if(one.length()> two.length()){
            bigger=one;
            minlength=two.length();

        }else{
            bigger=two;
            minlength = one.length();
        }
        for (int i=0; i< minlength; i++){
            merge+= one.charAt(i)+ ""+two.charAt(i);

        }
        merge+=bigger.substring(minlength);
        return merge;

    }

    public static void main(String[] args) {
        System.out.println(mergeString("abc", "defgh"));
    }
}
