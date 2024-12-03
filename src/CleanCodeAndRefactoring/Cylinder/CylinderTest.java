package CleanCodeAndRefactoring.Cylinder;

import static org.junit.Assert.assertEquals;

public class CylinderTest {
    void testGetVolume() {
        int radius = 5;
        int height = 10;
        double expected = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result, 0.001);
    }
}
