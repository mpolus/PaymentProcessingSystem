public class PayPalPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("PaypPal payment of " + "$" + amount + " processed");
    }
}
