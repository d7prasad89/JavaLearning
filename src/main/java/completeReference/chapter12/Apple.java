package completeReference.chapter12;

public enum Apple {

    HONEYCRISP(1), FUJI(2), GRANNY_SMITH(3), GALA(4), RED_DELICIOUS(5);

    private int price;

    Apple(int price) {
        this.price = price;
        System.out.println("Price of " + this + " is " + price + " per pound.");
    }

    public int getPrice() {
        return price;
    }
}
