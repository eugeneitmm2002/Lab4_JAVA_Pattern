public class Bank {
    Account clientAccount;
    Account storeAccount;

    public Bank(Account clientAccount, Account storeAccount) {
        this.clientAccount = clientAccount;
        this.storeAccount = storeAccount;
    }

    public boolean moneyTransaction(double money) {
        if (clientAccount.debit(money)) {
            storeAccount.moneyTransfer(money);
            return true;
        }
        System.out.println("Не достаточно средств");
        return false;
    }
}
