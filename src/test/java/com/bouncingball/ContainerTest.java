package com.bouncingball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @Test
    void moveBallLeftShouldGiveTrueIfBallMovedWithInContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(4, 4), 1, 1));
        assertTrue(container.moveBallLeft());
    }

    @Test
    void moveBallLeftShouldGiveFalseIfBallReachedEndOfContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(3, 5), 1, 1));
        assertFalse(container.moveBallLeft());
    }
}