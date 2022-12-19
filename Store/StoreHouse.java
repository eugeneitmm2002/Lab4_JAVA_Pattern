import java.util.HashMap;
import java.util.Scanner;

public class StoreHouse {
    HashMap products;
    Delivery delivery;

    public StoreHouse() {
        products = new HashMap();
        products.put("gamepad", new Product(1, "Gamepad", 10));
        products.put("mouse", new Product(2, "Mouse", 3));
        products.put("keyboard", new Product(3, "Keyboard", 0));
        delivery = new Delivery();
    }

    public boolean isAvailability(String nameProduct) {
        Product product = (Product) products.get(nameProduct);
        return product.count > 0;
    }

    public boolean toOrder(Bank bank, String productName, String address) {
        if (isAvailability(productName)) {
            if (bank.moneyTransaction(500)) {
                Product product = (Product) products.get(productName);
                product.count--;

                delivery.deliver(address);
                return true;
            }
            return false;
        }
        System.out.println("Нет продукта на складе");
        return false;
    }
}
