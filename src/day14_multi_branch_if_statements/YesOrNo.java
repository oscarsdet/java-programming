package day14_multi_branch_if_statements;
/*
print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
    true :
        "your file will be deleted"
        answer -> true
    false :
        "file deletion cancelled"
        answer -> false


"Did file get deleted? - true"
 */
public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("are you sure you want to delete this file?");
        char selection = 'n';
        boolean answer;
        String result;
//        int deletedFiles = 10; you can ad ore variables.

        if (selection == 'y') {
            System.out.println("your file Deleted");
            answer = true;
            result = "deleted";


        } else {
            System.out.println("File Deletion cancelled");
            answer = false;
            result = "not deleted";

        }
        System.out.println(" did file get deleted? - " + answer);
        System.out.println("Did file get deleted - " + result);

        }

    }

