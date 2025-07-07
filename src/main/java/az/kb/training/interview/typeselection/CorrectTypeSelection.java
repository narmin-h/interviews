package az.kb.training.interview.typeselection;

public class CorrectTypeSelection {

    public static class AppConfig {
        private int portNumber;      // Range 1-65535, int sufficient
        private int timeoutMs;       // Milliseconds, int handles up to 24 days
        private float percentage;    // 0.0-100.0, float acceptable for config
        private boolean featureFlag; // True/false only
    }


}
