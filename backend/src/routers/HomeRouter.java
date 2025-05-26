package routers;

import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class HomeRouter implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Bem-vindo à API!";
        exchange.sendResponseHeaders(200, response.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}
