import java.io.IOException;
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

            processConnetcion(socket);
        }
    }

    private void processConnetcion(Socket socket) {
    }