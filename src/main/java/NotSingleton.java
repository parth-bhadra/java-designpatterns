public class NotSingleton {
    public int a;
    public int b;

    public NotSingleton(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
