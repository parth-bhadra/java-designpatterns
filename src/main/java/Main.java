public class Main {
    public static void main(String[] args) {


        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        Thread threadAndi = new Thread(new ThreadAndi());
        Thread threadMandi = new Thread(new ThreadMandi());

        threadFoo.start();
        threadBar.start();
        threadAndi.start();
        threadMandi.start();




    }

    public static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.toString());
        }
    }

    public static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.toString());
        }
    }

    public static class ThreadAndi implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Andi");
            System.out.println(singleton.toString());
        }
    }

    public static class ThreadMandi implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Mandi");
            System.out.println(singleton.toString());
        }
    }
}
