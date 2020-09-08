package com.bouncingball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void moveForward() {
        final Ball ball = new Ball(new Point(2, 2), 1, 1);
        assertEquals(new Point(2, 3), ball.moveForward());
    }

    @Test
    void moveBackward() {
        final Ball ball = new Ball(new Point(2, 2), 1, 1);
        assertEquals(new Point(2, 1), ball.moveBackward());
    }

    @Test
    void moveLeft() {
        final Ball ball = new Ball(new Point(2, 2), 1, 1);
        assertEquals(new Point(1, 2), ball.moveLeft());
    }

    @Test
    void moveRight() {
        final Ball ball = new Ball(new Point(2, 2), 1, 1);
        assertEquals(new Point(3, 2), ball.moveRight());
    }

    @Test
    void toStringShouldGiveStringVersionOfBall() {
        final Ball ball = new Ball(new Point(2, 2), 1, 1);
        assertEquals("Ball{point=Point{x=2.0, y=2.0}, xDelta=1.0, yDelta=1.0}", ball.toString());
    }
}