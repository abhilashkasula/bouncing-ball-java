package com.bouncingball;

public class Container extends Rectangle {
    private final Ball ball;

    public Container(Point diagonalPoint1, Point diagonalPoint2, Ball ball) {
        super(diagonalPoint1, diagonalPoint2);
        this.ball = ball;
    }

    private boolean moveBall(Move move) {
        if(!super.covers(move.nextPosition(this.ball))) {
            return false;
        }
        move.moveBall(this.ball);
        return true;
    }

    public boolean moveBallLeft() {
        return moveBall(Move.LEFT);
    }

    public boolean moveBallRight() {
        return moveBall(Move.RIGHT);
    }

    public boolean moveBallForward() {
        return moveBall(Move.FORWARD);
    }

    public boolean moveBallBackWard() {
        return moveBall(Move.BACK);
    }
}
