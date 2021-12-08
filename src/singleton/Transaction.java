package singleton;

public class Transaction {
    private static String client;
    private static double value;

    public Transaction(String client, double value) {
        this.client = client;
        this.value = value;
    }

    public static void showTransactionInfo() {
        System.out.println("Client "+client+" has value "+value+" in your account.");
    }
}
