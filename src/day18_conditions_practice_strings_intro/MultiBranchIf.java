package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num = 5;
        if(num >0){
            System.out.println(num + " positive");
        }else if (num<0){
            System.out.println(num + " negative");
        }else{// else if (num == 0) you can do it this way too
            System.out.println(num + "is zero");
        }
    }
}
