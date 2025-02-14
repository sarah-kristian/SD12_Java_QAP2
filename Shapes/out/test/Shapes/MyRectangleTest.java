import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyRectangleTest {
    private MyRectangle rectangle;
    private MyPoint A;
    private MyPoint C;

    @BeforeEach
    void setUp() {
        A = new MyPoint(1, 6);
        C = new MyPoint(4, 2);
        rectangle = new MyRectangle(A, C);
    }

    @Test
    void testGetLength() {
        // Length: Math.abs(vC.getX() - vA.getX())
        double expectedLength = Math.abs(4 - 1);
        assertEquals(expectedLength, rectangle.getLength(), 0.0001); // Tolerance for floating-point precision
    }

    @Test
    void testGetHeight() {
        // Height: Math.abs(vC.getY() - vA.getY())
        double expectedHeight = Math.abs(2 - 6);
        assertEquals(expectedHeight, rectangle.getHeight(), 0.0001); // Tolerance for floating-point precision
    }

    @Test
    void testGetPerimeter() {
        // Perimeter should be 2 * (Math.abs(vC.getY() - vA.getY()) + Math.abs(vC.getX() - vA.getX()))
        double expectedPerimeter = 2 * (Math.abs(2 - 6) + Math.abs(4 - 1));
        assertEquals(expectedPerimeter, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void testGetArea() {
        // Area should be Math.abs(vC.getY() - vA.getY()) * Math.abs(vC.getX() - vA.getX())
        double expectedArea = Math.abs(2 - 6) * Math.abs(4 - 1);
        assertEquals(expectedArea, rectangle.getArea(), 0.0001);
    }

    @Test
    void testToString() {
        String expected = "My Rectangle: A(1,6), B(4,6), C(4,2), D(1,2)";
        assertEquals(expected, rectangle.toString());
    }
}
