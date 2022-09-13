//Teresa Tull worked on this on 9-11-2022 ch 2.4

package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("jap")) {
            return "Kon'nichiwa sekai!";
        } else if (lang.equals("ger")) {
            return "Hallo Welt!";
        } else {
            return "Hello, World!";
        }
    }
}
