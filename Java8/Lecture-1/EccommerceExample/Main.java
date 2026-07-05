import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product shirt = new Product("shirt", 5500, 4, "Cloth", 15);
        Product laptop = new Product("laptop", 10000, 6, "Electronics", 14);
        Product Iphone17 = new Product("Iphone17", 150000, 9, "Electronics", 19);
        Product AsusTufA15 = new Product("AsusTufA15", 80000, 10, "Electronics", 20);
        Product shoes = new Product("shoes", 5000, 4, "shoes", 15);
        Product pants = new Product("pants", 500, 6, "cloth", 15);

        List<Product> products = new ArrayList<>();
        products.add(shirt);
        products.add(laptop);
        products.add(Iphone17);
        products.add(AsusTufA15);
        products.add(shoes);
        products.add(pants);

        // Filter on price > 10000
        for (Product p : products) {
            if (p.getPrice() > 10000) {
                System.out.print(p + " ");
            }
        }

        System.out.println();
        // Filter on rate > 4
        for (Product p : products) {
            if (p.getRating() > 4) {
                System.out.print(p + " ");
            }
        }

        System.out.println();
        // Filter on Electronics
        for (Product p : products) {
            if (p.getCategory().equals("Electronics")) {
                System.out.print(p + " ");
            }
        }

        System.out.println();
        // Filter on rate > stocks
        for (Product p : products) {
            if (p.getStock() > 10) {
                System.out.print(p + " ");
            }
        }
    }
}
