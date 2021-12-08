package singleton;

public class Main {

    public static void main(String[] args) {
        Singleton.getInstance("A", 10500.99); // shoe this client
        Transaction.showTransactionInfo();
        Singleton.getInstance("B", 13400.99); // doesn't show this client because instance is in the previous client
        Transaction.showTransactionInfo();
        Singleton.closeInstance();
        Singleton.getInstance("C", 190500.50); // show this client because instance of previous client was closed
        Transaction.showTransactionInfo();;
    }

}
