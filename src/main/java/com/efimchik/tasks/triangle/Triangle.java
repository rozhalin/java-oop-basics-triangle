package com.efimchik.tasks.triangle;

import java.util.Arrays;

class Triangle {

    private Point[] points = new Point[3];

    public Triangle(Point a, Point b, Point c) {
        this.points[0] = a;
        this.points[1] = b;
        this.points[2] = c;
        Arrays.sort(points);

        if (this.degenerationCheck()) {
            throw new RuntimeException(String.format("This %s is degenerative", this));
        }
    }

    public double area() {
        double area;
        area = 0.5 * Math.abs(
                (points[0].getX() - points[2].getX()) *
                        (points[1].getY() - points[2].getY()) -
                        (points[1].getX() - points[2].getX()) *
                                (points[0].getY() - points[2].getY())
        );
        return area;
    }

    public Point centroid(){
        double sumX = 0.0;
        double sumY = 0.0;
        for (Point p : points) {
            sumX = sumX + p.getX();
            sumY = sumY + p.getY();
        }
        return new Point(sumX / 3.0, sumY / 3.0);
    }

    public boolean degenerationCheck() {
        return DoubleComparator.doubleCompare(this.area(), 0.0d) == 0;
    }

    public static void main(String[] args) {

    }
}
