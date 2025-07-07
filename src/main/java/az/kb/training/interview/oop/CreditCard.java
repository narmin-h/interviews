package az.kb.training.interview.oop;

public class CreditCard {
    private final String cardNumber;
    private double creditLimit;

    public CreditCard(String cardNumber, double creditLimit) {
        if (!isValidCardNumber(cardNumber)) {
            throw new IllegalArgumentException("Invalid card number format");
        }
        if (creditLimit < 0) {
            throw new IllegalArgumentException("Credit limit cannot be negative");
        }

        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        if (creditLimit < 0) {
            throw new IllegalArgumentException("Credit limit cannot be negative");
        }
        this.creditLimit = creditLimit;
    }

    private boolean isValidCardNumber(String number) {
        return number != null && number.matches("\\d{16}");
    }
}
