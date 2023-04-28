package firstexample;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int asciiCode = inputStream.read();

        System.out.println("ASCII Code=" + asciiCode + " (char representation=" + (char) asciiCode + ")");
    }
}