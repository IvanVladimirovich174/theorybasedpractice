import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyFirstServer myFirstServer = new MyFirstServer(8080);

        myFirstServer.start();
    }
}