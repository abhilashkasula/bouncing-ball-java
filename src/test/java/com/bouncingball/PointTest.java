package com.bouncingball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void equalsShouldGiveTrueForTwoEqualPoints() {
        final Point point1 = new Point(1, 2);
        final Point point2 = new Point(1, 2);
        assertTrue(point1.equals(point2));
    }

    @Test
    void equalsShouldGiveFalseForTwoInEqualPoints() {
        final Point point1 = new Point(1, 2);
        final Point point2 = new Point(1, 3);
        assertFalse(point1.equals(point2));
    }

    @Test
    void toStringShouldGiveStringVersionOfPoint() {
        final Point point = new Point(1, 2);
        assertEquals("Point{x=1.0, y=2.0}", point.toString());
    }
}