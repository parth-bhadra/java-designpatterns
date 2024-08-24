public class Singleton {
    private static Singleton instance;
    private final String val;

    private Singleton(String val) {
        this.val = val;
    }

    public static Singleton getInstance(String val) {
        // double check locking
        if (instance == null) {
            // lock it only for the first time
            synchronized (Singleton.class) {
                // check again as multiple threads can reach above step
                if (instance == null) instance = new Singleton(val);
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "val='" + val + '\'' +
                '}';
    }
}
