package day44_custom_classes;

import java.nio.channels.ConnectionPendingException;

/**
 * this class is to use
 */
public class MyApps {
    public static void main(String[] args) {
        // String app1 = "uber"; this is String object. just characters
        App uberApp = new App();// crating new object
        // opening Uber app - version = 3.5
        uberApp.name = "uber";
        uberApp.version = 3.5;
        uberApp.open();// call open method using object variable

        uberApp.version = 4.0;
        uberApp.open();//open new version

    }//todo create more


}
