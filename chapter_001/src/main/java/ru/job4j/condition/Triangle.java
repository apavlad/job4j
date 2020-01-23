package ru.job4j.condition;
import static java.lang.StrictMath.sqrt;
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public double area() {
        double rsl = -1;
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        double p = period(ab, bc, ca);
        if (this.exist(ab, bc, ca)) {
            return sqrt(p * (p - ab) * (p - bc) * (p - ca));
        } else {
            rsl = -1;
        }
        return rsl;
    }

    public static boolean exist(double a, double c, double b) {
        return ((a + b) > c && (b + c) > a && (a + c) > b) {

    }
}