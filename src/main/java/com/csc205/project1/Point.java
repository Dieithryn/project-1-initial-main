package com.csc205.project1;
/*
ChatGPT log:

create a java class that can can transform a point on a Cartesian plane

change the class name to 'Point' and add a method that will measure the distance from the original placement of that point.

create an overloaded constructor for point that accounts for when nothing is passed through to point

combine setX and setY to one method called setPoint

separate translate into shiftX and shiftY

add a distance method that outputs the distance from one point to another

the distance method should only pass through 1 variable

 */
public class Point {
    private double x;
    private double y;
    private double originalX;
    private double originalY;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.originalX = x;
        this.originalY = y;
    }

    public Point() {
        this(0.0, 0.0); // Default constructor creates a point at the origin (0, 0)
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Combined method to set both x and y coordinates
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to shift the x-coordinate
    public void shiftX(double dx) {
        this.x += dx;
    }

    // Method to shift the y-coordinate
    public void shiftY(double dy) {
        this.y += dy;
    }

    // Method to scale the point by a factor
    public void scale(double scaleFactor) {
        this.x *= scaleFactor;
        this.y *= scaleFactor;
    }

    // Method to rotate the point by a specified angle in radians
    public void rotate(double angleInRadians) {
        double newX = x * Math.cos(angleInRadians) - y * Math.sin(angleInRadians);
        double newY = x * Math.sin(angleInRadians) + y * Math.cos(angleInRadians);
        this.x = newX;
        this.y = newY;
    }

    // Method to measure the distance from the original placement of the point
    public double distanceFromOriginal() {
        double dx = x - originalX;
        double dy = y - originalY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to calculate the distance from this point to another point
    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

        @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}