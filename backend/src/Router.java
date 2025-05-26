import com.sun.net.httpserver.HttpServer;

import routers.*;

public class Router {
    public static void registerRoutes(HttpServer server) {
        
        server.createContext("/", new HomeRouter());
        server.createContext("/users", new UserRouter());
    }
}
