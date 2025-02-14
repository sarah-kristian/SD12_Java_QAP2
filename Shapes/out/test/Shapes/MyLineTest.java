import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLineTest {
    private MyLine line;
    private MyPoint begin;
    private MyPoint end;

    @BeforeEach
    void setUp() {
        begin = new MyPoint(1, 2);
        end = new MyPoint(4, 6);
        line = new MyLine(begin, end);
    }

    @Test
    void testConstructorWithPoints() {
        assertEquals(1, line.getBeginX());
        assertEquals(2, line.getBeginY());
        assertEquals(4, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void testConstructorWithCoordinates() {
        MyLine line2 = new MyLine(3, 5, 7, 9);
        assertEquals(3, line2.getBeginX());
        assertEquals(5, line2.getBeginY());
        assertEquals(7, line2.getEndX());
        assertEquals(9, line2.getEndY());
    }

    @Test
    void testSettersAndGetters() {
        line.setBegin(new MyPoint(10, 20));
        line.setEnd(new MyPoint(30, 40));

        assertEquals(10, line.getBeginX());
        assertEquals(20, line.getBeginY());
        assertEquals(30, line.getEndX());
        assertEquals(40, line.getEndY());
    }

    @Test
    void testSetBeginXAndY() {
        line.setBeginX(5);
        line.setBeginY(10);

        assertEquals(5, line.getBeginX());
        assertEquals(10, line.getBeginY());
    }

    @Test
    void testSetEndXAndY() {
        line.setEndX(15);
        line.setEndY(25);

        assertEquals(15, line.getEndX());
        assertEquals(25, line.getEndY());
    }

    @Test
    void testGetBeginXY() {
        int[] coords = line.getBeginXY();
        assertArrayEquals(new int[]{1, 2}, coords);
    }

    @Test
    void testSetBeginXY() {
        line.setBeginXY(8, 9);
        int[] coords = line.getBeginXY();
        assertArrayEquals(new int[]{8, 9}, coords);
    }

    @Test
    void testGetEndXY() {
        int[] coords = line.getEndXY();
        assertArrayEquals(new int[]{4, 6}, coords);
    }

    @Test
    void testSetEndXY() {
        line.setEndXY(12, 14);
        int[] coords = line.getEndXY();
        assertArrayEquals(new int[]{12, 14}, coords);
    }

    @Test
    void testGetLength() {
        // Distance formula: sqrt((x2-x1)^2 + (y2-y1)^2)
        double expectedLength = Math.sqrt((4 - 1) * (4 - 1) + (6 - 2) * (6 - 2));
        assertEquals(expectedLength, line.getLength(), 0.0001); // Tolerance for floating-point precision
    }

    @Test
    void testGetGradient() {
        // Gradient should be atan2(yDiff, xDiff)
        double expectedGradient = Math.atan2(6 - 2, 4 - 1);
        assertEquals(expectedGradient, line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        String expected = "My Line: begin = (1,2), end = (4,6)";
        assertEquals(expected, line.toString());
    }
}
