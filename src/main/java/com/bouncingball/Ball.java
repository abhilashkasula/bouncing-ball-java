package com.bouncingball;

public class Ball {
    private double x;
    private double y;
    private final double xDelta;
    private final double yDelta;

    public Ball(double x, double y, double xDelta, double yDelta) {
        this.x = x;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public double moveForward() {
        return this.y += this.yDelta;
    }

    public double moveBackward() {
        return this.y -= this.yDelta;
    }

    public double moveLeft() {
        return this.x -= this.xDelta;
    }

    public double moveRight() {
        return this.x += this.xDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
