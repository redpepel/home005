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
    public sircle( double x, double y) {
        if (radius < 0) {
            throw new IllegalArgumentException("МЕНЬШЕ");
        }
        this.radius = radius;


    }
    


    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;


    }
    public double diametr() {
        double diam = radius * 2;
        return diam;
    }

    public double area() {
        double area = radius * radius * 3.14;
        return area;
    }

    public double dlina() {
        double l = (radius * 2) * 3.14;
        return l;
    }

    public void lineika(double dradius) {
        radius = radius + dradius;

    }

    public String proverka(double tochkax, double tochkay) {
        double pr = x + radius;
        double pr1 = y + radius;
        String true1 = "точка находится в пределах данной окружности";
        String false1 = "Точка находится за пределами данной окружности";
        if ((tochkax >= x && tochkax <= pr) && (tochkay >= y && tochkay <= pr1)) {
            return true1;
        } else {
            return false1;
        }
    }

    ;
}
