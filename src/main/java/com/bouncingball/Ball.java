package com.bouncingball;

public class Ball {
    private Point point;
    private final double xDelta;
    private final double yDelta;

    public Ball(Point point, double xDelta, double yDelta) {
        this.point = point;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public Point moveForward() {
        return this.point = new Point(this.point.x, this.point.y + this.yDelta);
    }

    public Point moveBackward() {
        return this.point = new Point(this.point.x, this.point.y - this.yDelta);
    }

    public Point moveLeft() {
        return this.point = new Point(this.point.x - this.xDelta, this.point.y);
    }

    public Point moveRight() {
        return this.point = new Point(this.point.x + this.xDelta, this.point.y);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "point=" + point +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
