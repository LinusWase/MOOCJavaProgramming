
public class YourFirstAccount {

    public static void main(String[] args) {
        Account linusAccount = new Account("Linus account", 100.00);

        linusAccount.deposit(20.0);

        System.out.println(linusAccount);
    }
}
