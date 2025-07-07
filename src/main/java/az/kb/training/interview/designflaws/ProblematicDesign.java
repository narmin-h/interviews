package az.kb.training.interview.designflaws;

public class ProblematicDesign {


    public static void main(String[] args) {

        for (Integer i = 0; i < 1000000; i++) {
            // Empty loop
        }

        /*
         * Concurrent Modification Problem
         */
        /*
        List<User> users = getActiveUsers();
        for (User user : users) {
            if (user.getLastLoginDays() > 365) {
                users.remove(user); // ConcurrentModificationException!
            }
        }
        */
    }

    /*
     * User Session Problem - Thread Safety Issue
     */
    /*
    private static List<String> userSessions = new ArrayList<>();

    public void addSession(String sessionId) { 
        userSessions.add(sessionId); 
    }

    public void removeSession(String sessionId) { 
        userSessions.remove(sessionId); 
    }
    */

    /*
     * Expensive Product Problem - Inefficient Implementation
     */
    /*
    public List<Product> findExpensiveProducts(List<Product> products) {
        List<Product> expensive = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() > 1000 && !expensive.contains(p)) {
                expensive.add(p);
            }
        }
        return expensive;
    }
    */

    /*
     * Optimized Solution Using HashSet
     */
    /*
    Set<Product> expensiveSet = new HashSet<>();
    for (Product p : products) {
        if (p.getPrice() > 1000) {
            expensiveSet.add(p);
        }
    }
    */






}
