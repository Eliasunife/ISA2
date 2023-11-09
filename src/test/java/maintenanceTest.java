
import org.junit.Test;

import static org.junit.Assert.*;

public class maintenanceTest {
    @Test
    public void testAddActivity() {
        maintenance maintenanceClass = new maintenance();
        maintenanceClass.addActivity("olio macchina");
        assertTrue(maintenanceClass.checkUncompletedActivities().contains("olio macchina"));
    }

    @Test
    public void testMarkActivityCompleted() {
        maintenance maintenanceClass = new maintenance();
        maintenanceClass.addActivity("sistemare frigo");
        maintenanceClass.markActivityCompleted("sistemare frigo");
        assertFalse(maintenanceClass.checkUncompletedActivities().contains("sistemare frigo"));
    }
}
