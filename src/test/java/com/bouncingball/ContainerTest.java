package com.bouncingball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ContainerTest {

    private Ball ballMock;

    @BeforeEach
    void setUp() {
        ballMock = mock(Ball.class);
    }

    @Test
    void coversShouldGiveTrueIfGivenPointIsWithInContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);
        assertTrue(container.covers(new Point(4, 4)));
    }

    @Test
    void coversShouldGiveFalseIfGivenPointIsOutOfContainer() {
        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);
        assertFalse(container.covers(new Point(3, 6)));
    }

    @Test
    void moveBallLeftShouldGiveTrueIfBallMovedWithInContainer() {
        when(ballMock.left()).thenReturn(new Point(4, 4));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertTrue(container.moveBallLeft());
        verify(ballMock, times(1)).moveLeft();
    }

    @Test
    void moveBallLeftShouldGiveFalseIfBallReachedEndOfContainer() {
        when(ballMock.left()).thenReturn(new Point(6, 6 ));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertFalse(container.moveBallLeft());
        verify(ballMock, times(0)).moveLeft();
    }

    @Test
    void moveBallRightShouldGiveTrueIfBallMovedWithInContainer() {
        when(ballMock.right()).thenReturn(new Point(4, 4));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertTrue(container.moveBallRight());
        verify(ballMock, times(1)).moveRight();
    }

    @Test
    void moveBallRightShouldGiveFalseIfBallReachedEndOfContainer() {
        when(ballMock.right()).thenReturn(new Point(2, 5));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertFalse(container.moveBallRight());
        verify(ballMock, times(0)).moveRight();
    }

    @Test
    void moveBallForwardShouldGiveTrueIfBallMovedWithInContainer() {
        when(ballMock.forward()).thenReturn(new Point(4, 4));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertTrue(container.moveBallForward());
        verify(ballMock, times(1)).moveForward();
    }

    @Test
    void moveBallForwardShouldGiveFalseIfBallReachedEndOfContainer() {
        when(ballMock.forward()).thenReturn(new Point(3, 6));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertFalse(container.moveBallForward());
        verify(ballMock, times(0)).moveForward();
    }

    @Test
    void moveBallBackwardShouldGiveTrueIfBallMovedWithInContainer() {
        when(ballMock.back()).thenReturn(new Point(4, 4));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertTrue(container.moveBallBackWard());
        verify(ballMock, times(1)).moveBackward();
    }

    @Test
    void moveBallBackwardShouldGiveFalseIfBallReachedEndOfContainer() {
        when(ballMock.back()).thenReturn(new Point(3, 6));

        final Container container = new Container(new Point(3, 5), new Point(6, 0), ballMock);

        assertFalse(container.moveBallBackWard());
        verify(ballMock, times(0)).moveBackward();
    }
}