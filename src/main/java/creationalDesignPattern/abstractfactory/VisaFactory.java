package creationalDesignPattern.abstractfactory;

public class VisaFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case VISA -> {
                return new VisaCard();
            }
            default -> {
                return null;
            }
        }
    }
}
