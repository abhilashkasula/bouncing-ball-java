package com.bouncingball;

public class Container extends Rectangle {
    private final Ball ball;

    public Container(Point diogonalPoint1, Point diogonalPoint2, Ball ball) {
        super(diogonalPoint1, diogonalPoint2);
        this.ball = ball;
    }

    public boolean moveBallLeft() {
        if(!this.covers(this.ball.left())) {
            return false;
        }
        this.ball.moveLeft();
        return true;
    }

    public boolean moveBallRight() {
        if(!this.covers(this.ball.right())) {
            return false;
        }
        this.ball.moveRight();
        return true;
    }

    public boolean moveBallForward() {
        if(!this.covers(this.ball.forward())) {
            return false;
        }
        this.ball.moveForward();
        return true;
    }
}
