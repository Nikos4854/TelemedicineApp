public class HeartRateMonitor {

    public String evaluateBpm(int bpm) {
        if (bpm <= 0) {
            throw new IllegalArgumentException("Οι παλμοί πρέπει να είναι θετικός αριθμός.");
        }
        if (bpm > 100) {
            return "Υψηλό";
        } else if (bpm >= 60) {
            return "Φυσιολογικό";
        } else {
            return "Χαμηλό";
        }
    }
}