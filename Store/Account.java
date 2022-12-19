public class Account {
    int cardNumber;
    double money;

    public Account(int cardNumber, double money) {
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public boolean debit(double money) {
        if (enoughFunds(money)) {
            this.money =- money;
            return true;
        }
        return false;
    }

    public boolean enoughFunds(double money) {
        return this.money >= money;
    }

    public void moneyTransfer(double money) {
        this.money =+ money;
    }
}
