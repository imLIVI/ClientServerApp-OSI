public class Main {
    public static void main(String[] args) {
        ServerThread server = new ServerThread();
        server.start();
        ClientThread client = new ClientThread();
        client.start();
    }
}
