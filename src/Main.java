import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        ServerThread server = new ServerThread();
        server.start();
        ClientThread client = new ClientThread();
        client.start();


    }
}
