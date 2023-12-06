package testshape;

import itfactory.com.Rectangle;
import itfactory.com.Shape;
import itfactory.com.Square;
import itfactory.com.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void testTrianglePerimeter() {
        Shape triangle = new Triangle(3, 4, 5);
        assertEquals(12.0, triangle.calculatePerimeter(), 0.001);
    }

    @Test
    public void testSquarePerimeter() {
        Shape square = new Square(2);
        assertEquals(8.0, square.calculatePerimeter(), 0.001);
    }

    @Test
    public void testRectanglePerimeter() {
        Shape rectangle = new Rectangle(3, 5);
        assertEquals(16.0, rectangle.calculatePerimeter(), 0.001);
    }
}
