package org.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.rectangle.Rectangle.rectangle;
import static org.rectangle.Rectangle.square;

public class RectangleTest {

    @Test
    public void testArea15ForLength3Breadth5() {
        Rectangle rectangle = rectangle(3, 5);
        assertEquals(15, rectangle.area());
    }

    @Test
    public void testArea_3p375_ForLength_1p5_Breadth2p25() {
        Rectangle rectangle = rectangle(1.5, 2.25);
        assertEquals(3.375, rectangle.area());
    }

    @Test
    public void testPerimeter_16_ForLength_3_Breadth_5() {
        Rectangle rectangle = rectangle(3, 5);
        assertEquals(16, rectangle.perimeter());
    }

    @Test
    public void testPerimeter_7p5_ForLength_1p5_Breadth_2p25() {
        Rectangle rectangle = rectangle(1.5, 2.25);
        assertEquals(7.5, rectangle.perimeter());
    }

    @Test
    public void testArea_2p25_Square_size_1p5() {
        Rectangle square = square(1.5);
        assertEquals(2.25, square.area());
    }
}
