package completeReference.chapter12;

public class EnumTest {

    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RED_DELICIOUS;
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GALA;

        if (ap == Apple.GALA) {
            System.out.println("ap contains GALA.\n");
        }

        switch (ap) {
            case HONEYCRISP:
                System.out.println("Honeycrisp is $1.00 per pound.");
                break;
            case FUJI:
                System.out.println("Fuji is $2.00 per pound.");
                break;
            case GRANNY_SMITH:
                System.out.println("Granny Smith is $3.00 per pound.");
                break;
            case GALA:
                System.out.println("Gala is $4.00 per pound.");
                break;
            case RED_DELICIOUS:
                System.out.println("Red Delicious is $5.00 per pound.");
                break;
        }

    }
}
