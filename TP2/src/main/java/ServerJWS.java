import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String host= "http://0.0.0.0:9191/";
        Endpoint.publish(host,new BanqueService());
        System.out.println("web service deploye sur "+host);
    }
}