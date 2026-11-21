import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeartRateMonitorTest {

    private final HeartRateMonitor monitor = new HeartRateMonitor();

    @Test
    void testNormalBpmBoundaries() {
        assertEquals("Φυσιολογικό", monitor.evaluateBpm(60));
        assertEquals("Φυσιολογικό", monitor.evaluateBpm(80));
        assertEquals("Φυσιολογικό", monitor.evaluateBpm(100));
    }

    @Test
    void testHighBpm() {
        assertEquals("Υψηλό", monitor.evaluateBpm(101));
        assertEquals("Υψηλό", monitor.evaluateBpm(140));
    }

    @Test
    void testInvalidBpm() {
        assertThrows(IllegalArgumentException.class, () -> monitor.evaluateBpm(0));
    }
}