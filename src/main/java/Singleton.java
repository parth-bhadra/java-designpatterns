public class Singleton {
    private static Singleton instance;
    private final String val;

    // when someone tries to create an object
    // they will use new keyword
    // when new is used
    // constructor is called
    // then it creates the object

    // returning is not possible in a constructor
    // client should not be allowed to call it then
    // so make the constructor private

    private Singleton(String val) {
        this.val = val;
    }

    // constructor's job is to create the object
    // so it will be used for sure

    // returning is possible in functions/methods
    // this will unnecessarily enforce locking even after the object was created once
    // and slow down the subsequent concurrent calls

//    public synchronized static Singleton getInstance(String val) {
//        // lock this critical section
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) instance = new Singleton(val);
//            }
//        }
//        return instance;
//    }
    public static Singleton getInstance(String val) {
        // lock this critical section
        if (instance == null) {
            synchronized (Singleton.class) {
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
