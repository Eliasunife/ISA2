
import org.junit.Test;

import static org.junit.Assert.*;

public class maintenanceTest {
    @Test
    public void testAddActivity() {
        maintenance maintenanceClass = new maintenance();
        maintenanceClass.addActivity("Cambio olio macchina");
        assertTrue(maintenanceClass.checkUncompletedActivities().contains("cambio olio macchina"));
    }

    @Test
    public void testMarkActivityCompleted() {
        maintenance maintenanceClass = new maintenance();
        maintenanceClass.addActivity("sistemare il frigo");
        maintenanceClass.markActivityCompleted("sistemare il frigo");
        assertFalse(maintenanceClass.checkUncompletedActivities().contains("sistemare il frigo"));
    }
}
