public class Main {
    public static void main(String[] args) {
        // how to use builder design pattern
        // create an object of Builder class
        // the Builder has methods that will initialize the data members of Builder itself
        // the build method of the Builder will return a new object of the outer class

        // in this manner, builder design pattern is used to create objects

        // in contrast to creation of objects by constructor
        // builder design patterns allow to create objects by separating the construction of the object from its representation.

        // when to use
        // when immutability is the top most priority
        // because builder design pattern never allows the application to access any data member of the object of the House class
        // it only gives a fully built House Object through its build method

        // flexibility - avoid multiple constructor creation

        // readability++

        //when objects are simple


//        House house = new House.Builder()
//                .hasRoof(true)
//                .windows(4)
//                .build();

//        NotSingleton s1 = new NotSingleton(1, 2);
//        NotSingleton s2 = new NotSingleton(1, 2);
//
//        assert s1.equals(s2) : "Objects not equal";

//        Singleton s1 = new Singleton();
//        Singleton s1 = new Main.Singleton();
//        s1.a = 1;
//        s1.b = 2;

//        Singleton s2 = new Singleton();
//        Singleton s2 = new Main.Singleton();
//        s2.a = 3;
//        s2.b = 4;
//
//        System.out.println(s1.a); // 3
//        System.out.println(s1.b); // 4
//        System.out.println(s2.a); // 3
//        System.out.println(s2.b); // 4

        Singleton s1 = Singleton.getInstance();
        s1.a = 1;
        s1.b = 2;

        Singleton s2 = Singleton.getInstance();
        s2.a = 3;
        s2.b = 4;

        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
        System.out.println(s2.toString());




    }

//    public static class Singleton {
//        public static int a = 0;
//        public static int b = 0;
//
//    }
}
