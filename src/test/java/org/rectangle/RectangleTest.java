package org.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testArea15ForLength3Breadth5() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(15, rectangle.area());
    }

    @Test
    public void testArea_3p375_ForLength_1p5_Breadth2p25() {
        Rectangle rectangle = new Rectangle(1.5, 2.25);
        assertEquals(3.375, rectangle.area());
    }
}
