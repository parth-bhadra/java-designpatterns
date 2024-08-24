public class Singleton {
    private static Singleton instance;
    public static int a;
    public static int b;

    // when someone tries to create an object
    // they will use new keyword
    // when new is used
    // constructor is called
    // then it creates the object

    // returning is not possible in a constructor
    // client should not be allowed to call it then
    // so make the constructor private

    private Singleton() {

    }

    // constructor's job is to create the object
    // so it will be used for sure

    // returning is possible in functions/methods
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    @Override
    public String toString() {
        return "Singleton{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
