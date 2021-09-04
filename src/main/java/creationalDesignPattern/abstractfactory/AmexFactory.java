package creationalDesignPattern.abstractfactory;

public class AmexFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case AMEX -> {
                return new AmexCard();
            }
            default -> {
                return null;
            }
        }
    }
}
