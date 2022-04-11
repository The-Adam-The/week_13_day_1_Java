public abstract class PaymentCard implements IScan {

    private String cardNumber;
    private String expiryDate;

    public PaymentCard(String cardNumber, String expiryDate){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String scan() {
        return "Payment Successful";
    }

}
