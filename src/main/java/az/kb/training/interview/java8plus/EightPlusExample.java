package az.kb.training.interview.java8plus;

import java.util.Arrays;
import java.util.List;

public class EightPlusExample {
    public static void main(String[] args) {
        List<Double> orderAmounts = Arrays.asList(100.0, 250.0, 75.0, 300.0);

        /*
         * Using reduce
         */
        double total = orderAmounts.stream()
                .reduce(0.0, Double::sum);

        /*
         * Using specialized method
         */
        double totalAnotherVariant = orderAmounts.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    /*
     * Example of Optional handling
     */
    /*
    public String getUserDisplayName(Long userId) {
        return userRepository.findById(userId)
                .map(User::getName)
                .orElse("Guest User");
    }
    */

    /*
     * Example of grouping collectors
     */
    /*
    Map<String, List<Employee>> employeesByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

    // To get just the count per department
    Map<String, Long> countByDept = employees.stream()
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.counting()
            ));
    */

    /*
     * Example of filtering with predicates
     */
    /*
    Predicate<Transaction> highRiskFilter = transaction ->
            transaction.getAmount().compareTo(new BigDecimal("10000")) > 0;

    // Filter real-time stream
    List<Transaction> highRiskTransactions = paymentStream
            .filter(highRiskFilter)
            .collect(Collectors.toList());
    */

}
