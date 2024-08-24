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


        House house = new House.Builder()
                .hasRoof(true)
                .windows(4)
                .build();

    }
}
