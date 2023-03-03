class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double calculateCircleArea() {
        return 3.14159 * radius * radius;
    }

    public void circleAreaInfo() {
        double circleArea = calculateCircleArea();
        System.out.println("Pole koła o promieniu równym " + radius + " cm wynosi: " + circleArea + " cm2");
    }
}