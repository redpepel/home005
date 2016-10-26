package com.circle;

/**
 * Created by User on 21.10.2016.
 */
public class sircle {
    public double x;
    public double y;
    double radius;


    public sircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("МЕНЬШЕ");
        }
        this.radius = radius;

        this.x = 0;
        this.y = 0;

    }


    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;


    }

    ;
}
