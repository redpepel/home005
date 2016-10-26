package com.krug;

/**
 * Created by User on 26.10.2016.
 */
public class krug {

    public double x;
    public double y;
    public double rad;


    public krug(double radius, double x, double y) {
        if (radius < 0) {
            throw new IllegalArgumentException("МЕНЬШЕ");
        }
        this.rad = radius;


    }

    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public double diametr() {
        double diam = rad * 2;
        return diam;
    }

    public double area() {
        double area = rad * rad * 3.14;
        return area;
    }

    public double dlina() {
        double l = (rad * 2) * 3.14;
        return l;
    }

    public void lineika(double dradius) {
        rad = rad + dradius;

    }

    public String proverka(double tochkax, double tochkay) {
        double pr = x + rad;
        double pr1 = y + rad;
        String true1 = "точка находится в пределах данной окружности";
        String false1 = "Точка находится за пределами данной окружности";
        if ((tochkax >= x && tochkax <= pr) && (tochkay >= y && tochkay <= pr1)) {
            return true1;
        } else {
            return false1;
        }
    }


}


