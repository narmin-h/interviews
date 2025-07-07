package az.kb.training.interview.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionChoice {

    public static void main(String[] args) {
        /*
         * Inefficient approach - O(n*m) complexity
         * Potentially 500 million comparisons!
         */
        /*
        for (Order order : orders) {
            for (Product product : products) {
                if (order.getProductId().equals(product.getId())) {
                    order.setProduct(product);
                   break;
                }
            }
        }
        */

        /*
         * Optimized approach using HashMap
         */
        /*
        // Step 1: Create lookup map O(n)
        Map<String, Product> productMap = new HashMap<>();
        for (Product product : products) {
            productMap.put(product.getId(), product);
        }

        // Step 2: Match orders O(m)
        for (Order order : orders) {
            Product product = productMap.get(order.getProductId());
            if (product != null) {
                order.setProduct(product);
            }
        }
        */

        /*
         * Problematic removal from list during iteration
         */
        /*
        public void removeInactiveUsers(List<User> users) {
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                if (user.getLastLoginDays() > 365) {
                    users.remove(i);  // Problem: This shifts all elements left
                }
            }
        }
        */

        /*
         * Safe removal using Iterator
         */
        /*
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getLastLoginDays() > 365) {
                iterator.remove(); // Safe removal
            }
        }
        */

        /*
         * Alternative approach using Java 8+ removeIf
         */
        /*
        users.removeIf(user -> user.getLastLoginDays() > 365);
        */



    }


    public class DiscountCalculator {
        private static final Map<Double, Double> discountMap = new HashMap<>();

        static {
            discountMap.put(100.0, 0.05);
            discountMap.put(500.0, 0.10);
            discountMap.put(1000.0, 0.15);
        }

        public static double getDiscountForThreshold(double threshold) {
            return discountMap.getOrDefault(threshold, 0.0);
        }
    }

    /*
     * Shopping Cart example using HashSet
     */
    /*
    Set<Item> cart = new HashSet<>();
    if (!cart.contains(item)) {
        cart.add(item);
    }
    */

    /*
     * Jira Ticket example using Queue
     */
    /*
    Queue<Ticket> ticketQueue = new LinkedList<>();
    ticketQueue.offer(new Ticket("Issue A"));
    ticketQueue.offer(new Ticket("Issue B"));

    Ticket next = ticketQueue.poll(); // processes "Issue A"
    */

    /*
     * Sorted collection example using TreeSet
     */
    /*
    TreeSet<Account> accountsByBalance = new TreeSet<>(
            Comparator.comparing(Account::getBalance)
    );
    */

}
