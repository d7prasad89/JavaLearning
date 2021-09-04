package creationalDesignPattern.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(652);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.AMEX);
        System.out.println(creditCard.getCardNumber());
    }
}
