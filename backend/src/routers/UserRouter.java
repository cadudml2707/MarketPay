package routers;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;

public class UserRouter implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        String response = "";

        switch (method){
            case "GET":
                response = "Você usou GET (Listar usuários)";
                break;
            case "POST":
                response = "Você usou POST (Criar Usuário)";
                break;
            case "PUT":
                response = "Você usou PUT (Atualizar Usuário)";
                break;
            case "DELETE":
                response = "Você usou DELETE (Deletar Usuário)";
                break;
        }

        exchange.sendResponseHeaders(200, response.length());
        send(exchange, response);
    }

    private void send(HttpExchange exchange, String response) throws IOException {
        try (OutputStream os = exchange.getResponseBody()){
            os.write(response.getBytes());
        }
    }
}
