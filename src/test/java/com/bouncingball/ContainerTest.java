package com.bouncingball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    @Test
    void coversShouldGiveTrueIfGivenPointIsWithInContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(4, 4), 1, 1));
        assertTrue(container.covers(new Point(4, 4)));
    }

    @Test
    void coversShouldGiveFalseIfGivenPointIsOutOfContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(4, 4), 1, 1));
        assertFalse(container.covers(new Point(3, 6)));
    }

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

    @Test
    void moveBallRightShouldGiveTrueIfBallMovedWithInContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(3, 5), 1, 1));
        assertTrue(container.moveBallRight());
    }

    @Test
    void moveBallRightShouldGiveFalseIfBallReachedEndOfContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(6, 2), 1, 1));
        assertFalse(container.moveBallRight());
    }

    @Test
    void moveBallForwardShouldGiveTrueIfBallMovedWithInContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(3, 2), 1, 1));
        assertTrue(container.moveBallForward());
    }

    @Test
    void moveBallForwardShouldGiveFalseIfBallReachedEndOfContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(3, 5), 1, 1));
        assertFalse(container.moveBallForward());
    }

    @Test
    void moveBallBackwardShouldGiveTrueIfBallMovedWithInContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(3, 2), 1, 1));
        assertTrue(container.moveBallBackWard());
    }

    @Test
    void moveBallBackwardShouldGiveFalseIfBallReachedEndOfContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), new Ball(new Point(3, 0), 1, 1));
        assertFalse(container.moveBallBackWard());
    }
}