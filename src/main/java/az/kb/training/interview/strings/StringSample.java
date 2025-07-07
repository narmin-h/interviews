package az.kb.training.interview.strings;

public class StringSample {

    public static void main(String[] args) {
        /*
         * String Handling Approaches
         */
        /*
        // Approach A: String concatenation
        String csv = "";
        for (Record record : records) {
            csv += record.toCsv() + "\n"; // Creates new String object each time
        }

        // Approach B: StringBuilder
        StringBuilder sb = new StringBuilder();
        for (Record record : records) {
            sb.append(record.toCsv()).append("\n");
        }
        String csv = sb.toString();

        // Approach C: StringJoiner
        StringJoiner joiner = new StringJoiner("\n");
        for (Record record : records) {
            joiner.add(record.toCsv());
        }
        String csv = joiner.toString();
        */
    }

    /*
     * Card Number Masking Example
     * Output: maskCardNumber("1234567812345678") → ************5678
     */
    /*
    public String maskCardNumber(String cardNumber) {
        int len = cardNumber.length();
        StringBuilder masked = new StringBuilder(len);

        for (int i = 0; i < len - 4; i++) {
            masked.append('*');
        }
        masked.append(cardNumber.substring(len - 4));
        return masked.toString();
    }
    */

}
