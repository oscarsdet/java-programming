package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "apple";
        String model = "iphone 11";
        String color = "green";
        double price = 699.99;
        int storage = 256;
        boolean hasCamera = true;
//        System.out.println(brand);
//        System.out.println(model);
//        System.out.println(color);
//        System.out.println(price);
//        System.out.println(storage);
//        System.out.println(hasCamera);
//        String is a non-primitive, object type.
//        and it is the most popular datatype in the world!
//        any value within double quotes becomes a String.
//        "hello" ---> String value, it is letters, and with doule quote
//        "123" ---> Also String , because we added double quote
//        125 --> Not a string , it is whole number. int

        String City = "baku";
        System.out.println("City is " + City);
        System.out.println("brand is " + brand);
        System.out.println("model is " + model);
        System.out.println("color is " + color);
        System.out.println("price is " + price);
        System.out.println("storage is " + storage + "GB");
        System.out.println("has camera? -" +hasCamera);
        System.out.println("******prnt in one line now *****");
        System.out.println("brand name:" +brand + "\nmodel name:" + model + "\ncolor: " + color +
                "\nprice: " + price + "\nstorage: " + storage + "GB"+ "\nhasCamera:" + hasCamera);

    }
}