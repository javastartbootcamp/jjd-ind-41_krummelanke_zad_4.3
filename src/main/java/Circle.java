class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return 3.14159 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}