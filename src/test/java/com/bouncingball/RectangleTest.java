package com.bouncingball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void coversShouldGiveTrueIfGivenPointIsOnRectangle() {
        final Rectangle rectangle = new Rectangle(new Point(3, 5), new Point(6, 0));
        assertTrue(rectangle.covers(new Point(3, 5)));
        assertTrue(rectangle.covers(new Point(3, 0)));
        assertTrue(rectangle.covers(new Point(6, 0)));
        assertTrue(rectangle.covers(new Point(6, 5)));
    }

    @Test
    void coversShouldGiveTrueIfGivenPointIsWithInRectangle() {
        final Rectangle rectangle = new Rectangle(new Point(3, 5), new Point(6, 0));
        assertTrue(rectangle.covers(new Point(4, 4)));
    }

    @Test
    void coversShouldGiveFalseIfGivenPointIsOutsideOfRectangle() {
        final Rectangle rectangle = new Rectangle(new Point(3, 5), new Point(6, 0));
        assertFalse(rectangle.covers(new Point(7, 0)));
    }
}