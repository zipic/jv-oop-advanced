package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area " + getArea() + " sq.units "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
