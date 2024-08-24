public class House {
    private final int walls;
    private final int doors;
    private final int windows;
    private final boolean hasRoof;
    private final boolean hasGarage;
    
    public House(Builder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.hasRoof = builder.hasRoof;
        this.hasGarage = builder.hasGarage;
    }

    // objects can be created using constructor or using builder design pattern or using getter setter methods
    
    // steps to implement builder design pattern
    // create a static nested class
    // at the end, create a build method that returns an instance of the outer class
    // write a constructor that takes an instance of the builder class and initializes the fields
    
    public static class Builder {
        private int walls;
        private int doors;
        private int windows;
        private boolean hasRoof;
        private boolean hasGarage;

        public Builder walls(int walls) {
            this.walls = walls;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder hasRoof(boolean hasRoof) {
            this.hasRoof = hasRoof;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
