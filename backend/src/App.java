import javax.swing.JOptionPane;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws IOException{
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        Router.registerRoutes(server);

        server.setExecutor(null);
        server.start();

        System.out.println("Servidor está rodando em http://localhost:8000/"); 
    }
}
