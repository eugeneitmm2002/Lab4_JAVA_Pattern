public class Store {
    StoreHouse storeHouse;
    Customer customer;
    Bank bank;
    String productName;
    String address;

    public Store(Customer client) {
        storeHouse = new StoreHouse();
        customer = client;

        productName = customer.chooseProductName();
        bank = new Bank(new Account(customer.inputCard(), 1000), new Account(123432532, 423632));
        address = customer.inputAddress();
    }

    public void doSale() {
        storeHouse.toOrder(bank, productName, address);
    }
}
