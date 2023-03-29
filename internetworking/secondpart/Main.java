package secondpart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        String ip = "localhost";

        int port = 8080;

        try {
            Socket socket = new Socket(ip, port);

            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.write("GET / HTTP /1.1\n");
            writer.println("Host: localhost");
            writer.println();
            writer.flush();

            char[] message = new char[10_000];
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            reader.read(message);

            System.out.println("OUT: ");
            System.out.println(new String(message));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}