package homework.Loops_04_04_2021;
/*
Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2
conditional statements. chapter 3 String manipulation. Chapter 4
Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.
chapter 8 instance and static. Chapter 9 Constructors. Chapter 10
Encapsulation and Inheritance. Chapter 11 Abstraction and
Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter
14 Learn more.
14 Chapters -> value of the book: 140
 */
public class BookValue {
    public static void main(String[] args) {
        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2\n" +
                "conditional statements. chapter 3 String manipulation. Chapter 4\n" +
                "Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.\n" +
                "chapter 8 instance and static. Chapter 9 Constructors. Chapter 10\n" +
                "Encapsulation and Inheritance. Chapter 11 Abstraction and\n" +
                "Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter\n" +
                "14 Learn more.";
    int count = 0;
    String chapter;
    int price;
    for (int i = 0; i < book.length()-6; i++){
        chapter = book.substring(i, i+7 );
        if (chapter.equalsIgnoreCase("chapter")){
            count++;
        }
        }
    price = count * 10;
        System.out.println("Morudil's Book Value=  $" +price);

    }
}
