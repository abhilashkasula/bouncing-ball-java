package com.bouncingball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest {

    @Test
    void moveLEFTShouldGiveNextPositionOfBall() {
        final Ball ball = new Ball(new Point(5, 2), 1, 1);
        assertEquals(new Point(4, 2), Move.LEFT.nextPosition(ball));
    }

    @Test
    void moveLEFTShouldMoveTheBall() {
        final Ball ball = new Ball(new Point(4, 2), 1, 1);
        assertEquals(new Point(3, 2), Move.LEFT.moveBall(ball));
    }

    @Test
    void moveRIGHTShouldGiveNextPositionOfBall() {
        final Ball ball = new Ball(new Point(5, 2), 1, 1);
        assertEquals(new Point(6, 2), Move.RIGHT.nextPosition(ball));
    }

    @Test
    void moveRIGHTShouldMoveTheBall() {
        final Ball ball = new Ball(new Point(4, 2), 1, 1);
        assertEquals(new Point(5, 2), Move.RIGHT.moveBall(ball));
    }

    @Test
    void moveFORWARDShouldGiveNextPositionOfBall() {
        final Ball ball = new Ball(new Point(5, 2), 1, 1);
        assertEquals(new Point(5, 3), Move.FORWARD.nextPosition(ball));
    }

    @Test
    void moveFORWARdShouldMoveTheBall() {
        final Ball ball = new Ball(new Point(4, 2), 1, 1);
        assertEquals(new Point(4, 3), Move.FORWARD.moveBall(ball));
    }

    @Test
    void moveBACKShouldGiveNextPositionOfBall() {
        final Ball ball = new Ball(new Point(5, 2), 1, 1);
        assertEquals(new Point(5, 1), Move.BACK.nextPosition(ball));
    }

    @Test
    void moveBACKShouldMoveTheBall() {
        final Ball ball = new Ball(new Point(4, 2), 1, 1);
        assertEquals(new Point(4, 1), Move.BACK.moveBall(ball));
    }
}