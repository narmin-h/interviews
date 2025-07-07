package az.kb.training.interview.exception;

public class ExceptionUsage {

    /*
     * Example of custom exception handling
     */
    /*
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException(this.balance, amount);
        }
        this.balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + this.balance);
    }
    */

    /*
     * Example of try-with-resources and exception handling in streams
     */
    /*
    public void processLargeCSV(String inputFile, String outputFile) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {

            reader.lines()
                    .skip(1) // Skip header
                    .map(this::parseCSVLine)
                    .filter(Objects::nonNull)
                    .filter(record -> record.isValid())
                    .map(this::transformRecord)
                    .forEach(transformedRecord -> {
                        try {
                            writer.write(transformedRecord.toCSV());
                            writer.newLine();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException("Error processing CSV", e);
        }
    }
    */
}
