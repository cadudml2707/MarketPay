package routers;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class VendaRouter implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Rota de vendas acessada";
        exchange.sendResponseHeaders(200, response.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}
