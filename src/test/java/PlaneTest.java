import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup() {
        plane = new Plane(PlaneType.AIRBUSBELUGA);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.AIRBUSBELUGA, plane.getType());
    }

    @Test
    public void getCapacityFromPlaneType() {
        assertEquals(700, plane.getCapacity());
    }

    @Test
    public void getWeightFromPlaneType() {
        assertEquals(86200, plane.getWeight(), 0.01);
    }
}