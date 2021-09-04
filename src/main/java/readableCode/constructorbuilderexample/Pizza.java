package readableCode.constructorbuilderexample;

public class Pizza {

    Builder builder;

    public Pizza(Builder builder) {
        this.builder = builder;
    }

    static class Builder {

        // Mandatory
        private final int size;

        Builder(int size) {
            this.size = size;
        }
        // default is false
        private boolean cheese;
        private boolean chicken;

        Builder cheese(boolean value) {
            cheese = value;
            return this;
        }

        Builder chicken(boolean value) {
            chicken = value;
            return this;
        }

        Pizza build() {
            return new Pizza(this);
        }


        public int getSize() {
            return size;
        }

        public boolean isCheese() {
            return cheese;
        }

        public void setCheese(boolean cheese) {
            this.cheese = cheese;
        }

        public boolean isChicken() {
            return chicken;
        }

        public void setChicken(boolean chicken) {
            this.chicken = chicken;
        }

        }
    @Override
    public String toString() {
        return "Pizza chicken is " + this.builder.chicken + " cheese " + this.builder.cheese;
    }
}
