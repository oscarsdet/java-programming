package day05_primitives_concatanation;

import javax.sound.midi.SysexMessage;
import javax.sql.rowset.spi.SyncProvider;

public class Watchinfo {
    public static void main(String[] args){
        String Brand = "Rolex";
        String Color = "Silver";
        double Price = 1000.98;
        boolean waterResistant = true;
        boolean isSmart = false;
        char Gender = 'F';

        System.out.println("Brand: " + Brand);
        System.out.println("Price: " + Price);
        System.out.println("is Water Resistant: "+ waterResistant);
        System.out.println("is Smart: " + isSmart);
        System.out.println("Gender: " +Gender);

        System.out.println("********* WITH TABS**********");

        System.out.println("Brand: \t\t\t\t" + Brand);
        System.out.println("Watch color: \t\t" + Color);
        System.out.println("Price: \t\t\t\t$" + Price);
        System.out.println("Water resistant: \t" + waterResistant);
        System.out.println("Smart watch: \t\t" + isSmart);
        System.out.println("Gender \t\t\t\t" + Gender);

        System.out.println("*******TAB AND NEW LINES *******");

        System.out.println("Watch brand\t\t\t"+Brand+"\n"+"Color\t\t\t\t"+Color+"\n"+
                "Price\t\t\t\t"+Price+"\n"+"Water resistant\t\t"+waterResistant+"\n"+"Is smart\t\t\t"+isSmart+"\n"+
                "Gender\t\t\t\t"+Gender);

        System.out.println("Hello world.");

    }
}
