package Payment;

public class PayWithCard implements PaymentStrategy {
    private int cardNumber;
    public PayWithCard(int cardNumber){
        this.cardNumber=cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("You paid: " + amount + " with card: " + cardNumber);
    }
}
