package es.uah.matcomp.mp.e1.ejerciciosclases.e1;

/**
 * Atribute circle
 */
public class Circle {
    private double  radius;
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius +"]";// Aquí queremos que nos lo retorne de esra forma
    }
}
