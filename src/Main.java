public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();


        processPayment(creditCard, 150.0);
        processPayment(payPal, 200.50);
        processPayment(bankTransfer, 1000.0);

    }

    public static void processPayment(Payment paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}
