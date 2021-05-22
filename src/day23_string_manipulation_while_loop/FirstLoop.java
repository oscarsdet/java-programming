package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 0;

          while (i <= 25) {
            System.out.println(i);
            i++;
        }
          int apple = 0;
          while (apple <= 3){
              System.out.println("apple - > " + apple);
              apple++;
              System.out.println("apple = " + apple);
              // infite loop
              while (true){
                  System.out.println("Hello World");
              }
          }
    }
}