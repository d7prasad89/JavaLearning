package creationalDesignPattern.abstractfactory;

public class VisaCard extends CreditCard{
    public VisaCard() {
        super();
        this.setCardName("Visa");
        this.setCardNumber(12345);
        this.setCvvNumber(894);
    }
}
