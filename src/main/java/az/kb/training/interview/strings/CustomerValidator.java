package az.kb.training.interview.strings;

public class CustomerValidator {

    public boolean isValidPassword(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    public String formatCustomerName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName.toUpperCase();
    }

    public boolean authenticateUser(String inputPassword, String storedPassword) {
        return inputPassword.equals(storedPassword);
    }

    public String maskAccountNumber(String accountNumber) {
        return "****" + accountNumber.substring(4);
    }
}
