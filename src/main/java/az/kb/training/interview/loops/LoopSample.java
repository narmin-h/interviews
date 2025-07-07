package az.kb.training.interview.loops;

import java.util.ArrayList;

public class LoopSample {

    public static void main(String[] args) {

        /*
         * Approach A
         */
        /*
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCity().equals(targetCity)) {
                results.add(customers.get(i));
            }
        }
        */

        /*
         * Approach B
         */
        /*
        for (Customer customer : customers) {
            if (customer.getCity().equals(targetCity)) {
                results.add(customer);
                customers.remove
            }
        }
        */

        /*
         * Approach C
         */
        /*
        Iterator<Customer> it = customers.iterator();
        while (it.hasNext()) {
            Customer customer = it.next();
            if (customer.getCity().equals(targetCity)) {
                results.add(customer);
            }
        }
        */

        /*
         * Batch Processing - 1000 record max 100_000 per customer
         */
        /*
        int batchSize = 1000;
        int totalRecords = 100_000;

        for (int offset = 0; offset < totalRecords; offset += batchSize) {
            List<Record> batch = fetchRecords(offset, batchSize);
            processBatch(batch);
        }

    int offset = 0;
    while (offset < totalRecords) {
    List<Record> batch = fetchRecords(offset, batchSize);
    processBatch(batch);
    offset += batchSize;
}
        */

        /*
         * Loop Choice for different scenarios
         */

        /*
         * BEST: while loop - condition-based termination
         */
        /*
        while ((line = bufferedReader.readLine()) != null) {
            processLine(line);
        }
        */

        /*
         * BEST: Enhanced for-loop - simple iteration
         */
        /*
        for (String item : stringArray) {
            processItem(item);
        }
        */

        /*
         * Retrying network requests
         * BEST: do-while - must execute at least once
         */
        /*
        int attempts = 0;
        boolean success;
        do {
            success = makeNetworkRequest();
            attempts++;
        } while (!success && attempts < MAX_RETRIES);
        */
    }
}
