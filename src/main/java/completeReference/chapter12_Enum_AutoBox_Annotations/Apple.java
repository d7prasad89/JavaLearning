package completeReference.chapter12_Enum_AutoBox_Annotations;

public enum Apple {

    HONEYCRISP(1), FUJI(2), GRANNY_SMITH(3), GALA(4), RED_DELICIOUS(5);

    private int price;

    Apple(int price) {
        this.price = price;
        System.out.println("Price of " + this + " is " + price + " per pound.");
    }

    Apple() {
        this.price = -1;
        System.out.println("Default Constructor");
    }

    public int getPrice() {
        return price;
    }
}
