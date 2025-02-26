package S1ex3;

public class BankAccount {
    public int amount;

    public BankAccount(int money) {
        if (money >= 100) {
            deposit(money);
        } else {
            System.out.println("Déposer au moins 100CHF lors de la création du compte.");
        }
    }

    public void deposit(int money) {
        amount += money;
    }

    public void withdraw(int money) {
        if (amount >= money) {
            amount -= money;
        } else {
            System.out.println("Pas assez d'argent sur ce compte !");
        }
    }
}
