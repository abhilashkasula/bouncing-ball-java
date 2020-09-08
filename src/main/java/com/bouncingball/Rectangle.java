package com.bouncingball;

import java.util.Arrays;

public class Rectangle {
    private final Point diogonalPoint1;
    private final Point diogonalPoint2;

    public Rectangle(Point diogonalPoint1, Point diogonalPoint2) {
        this.diogonalPoint1 = diogonalPoint1;
        this.diogonalPoint2 = diogonalPoint2;
    }

    public boolean covers(Point point) {
        final double[] xCoordinates = {diogonalPoint1.x, diogonalPoint2.x};
        final double[] yCoordinates = {diogonalPoint1.y, diogonalPoint2.y};
        Arrays.sort(xCoordinates);
        Arrays.sort(yCoordinates);
        boolean isPointInXRange = point.x >= xCoordinates[0] && point.x <= xCoordinates[1];
        return  isPointInXRange && point.y >= yCoordinates[0] && point.y <= yCoordinates[1];
    }
}
