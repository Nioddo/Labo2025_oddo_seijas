package ejersCurso;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShopApp {
    public static void main(String[] args) {
        double total = 0.0;
        int measurement = 3;
        System.out.println(Clothing.getTAX() + " " + Clothing.getMIN_PRICE());
        System.out.println("¡Bienvenido a la tienda de Duke!");
        System.out.println("Verificando atributos estaticos: " + Clothing.getMIN_PRICE() + ", " + Clothing.getTAX());
        Customer c1 = new Customer("Pinky", measurement);

        System.out.println("Cliente: " + c1.getName());
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] stock = {item1, item2, item3, item4};
        c1.addItems(stock);

        System.out.println(item2);

        c1.getTotalClothingCost(stock, Clothing.getTAX());

        int average = 0;
        int count = 0;
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        try {
            average = (count == 0) ? 0 : average / count;
            System.out.println("Average price = " + average + ", Count = " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        }
        Arrays.sort(c1.getItems());
        for (Clothing prenda : c1.getItems()){
            System.out.println("Item: " + prenda);
        }
        for (Clothing prenda : c1.getItems()) {
            System.out.println("Item: " + prenda);
        }

        try {
            ItemList list = new ItemList(stock);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration configuration = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost()).port(8888).build();
            WebServer webServer = WebServer.create(configuration, routing);
            webServer.start();
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}