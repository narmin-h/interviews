package az.kb.training.interview.jdbc;

public class JdbcExample {
    public static void main(String[] args) {
        /*
         * Batch Processing with JDBC
         */
        /*
        String sql = "INSERT INTO transactions (account_id, amount, type) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);

            for (Transaction txn : transactions) {
                stmt.setLong(1, txn.getAccountId());
                stmt.setBigDecimal(2, txn.getAmount());
                stmt.setString(3, txn.getType());
                stmt.addBatch(); // Add to batch
            }

            int[] results = stmt.executeBatch(); // Single network call
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
        */
    }
}
