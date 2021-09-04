package creationalDesignPattern.abstractfactory;

public class AmexCard extends CreditCard{
    public AmexCard() {
        super();
        this.setCardName("Amex");
        this.setCardNumber(54789);
        this.setCvvNumber(894);
    }
}
