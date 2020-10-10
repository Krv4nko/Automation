package HM;

public class BankAccount {
    int id;
    String name;
    double balance = 12.17;

    void snyatiesoscheta(double snyatiedeneg) {
        System.out.println("balance do: " + balance);
        balance -= snyatiedeneg;
        System.out.println("balance posle: " + balance);
        System.out.println();
    }
}

    class BankAccount2 {
        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();

            MyAccount.snyatiesoscheta(6.2);

        }
    }












