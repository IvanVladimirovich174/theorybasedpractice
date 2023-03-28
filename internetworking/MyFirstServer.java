import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyFirstServer {
    private final int port;

    public MyFirstServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket socket = serverSocket.accept();

            try {
                processConnetcion(socket);
            } catch (Exception ex) {
                System.out.println("Failed to .processConnection() error=" + ex.toString());
                ex.printStackTrace();
            } finally {
                socket.close();
            }

        }
    }

    private void processConnetcion(Socket socket) throws IOException {
        System.out.println("Method .processConnection() started");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        char[] message = new char[512];

        reader.read(message);

        System.out.println("IN:");
        System.out.println(message);
        System.out.println();


        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.write("HTTP/1.1 200 OK");
        writer.println();
        writer.flush();

        System.out.println("Method processConnection() finished");
    }
}