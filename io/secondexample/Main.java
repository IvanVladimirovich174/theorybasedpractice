package secondexample;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");

        System.out.println("Is file exist: " + file.exists());
    }
}