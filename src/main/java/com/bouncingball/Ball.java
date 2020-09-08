package com.bouncingball;

public class Ball {
    private Point position;
    private final double xDelta;
    private final double yDelta;

    public Ball(Point position, double xDelta, double yDelta) {
        this.position = position;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public Point forward() {
        return new Point(this.position.x, this.position.y + this.yDelta);
    }

    public Point back() {
        return new Point(this.position.x, this.position.y - this.yDelta);
    }

    public Point left() {
        return new Point(this.position.x - this.xDelta, this.position.y);
    }

    public Point right() {
        return new Point(this.position.x + this.xDelta, this.position.y);
    }

    public Point moveForward() {
        return this.position = this.forward();
    }

    public Point moveBackward() {
        return this.position = this.back();
    }

    public Point moveLeft() {
        return this.position = this.left();
    }

    public Point moveRight() {
        return this.position = this.right();
    }

    @Override
    public String toString() {
        return "Ball{" +
                "point=" + position +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
