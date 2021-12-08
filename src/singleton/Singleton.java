package singleton;

public class Singleton {

    private static Singleton instance;
    public static Transaction transaction;

    private Singleton(String client, double value) {
        transaction = new Transaction(client, value);
    }

    public static Singleton getInstance(String client, double value) {
        if (instance == null) {
            instance = new Singleton(client, value);
        }
        return instance;
    }

    public static void closeInstance() {
        instance = null;
        transaction = null;
    }

}
