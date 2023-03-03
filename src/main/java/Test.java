class Test {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        Circle circle1 = new Circle(4.75);
        Triangle triangle1 = new Triangle(2, 3, 4);
        Rectangle rectangle1 = new Rectangle(10, 20);

        ShapeCalculator info = new ShapeCalculator();
        info.squareAreaInfo(square1);
        info.circleAreaInfo(circle1);
        info.trianglePerimeterInfo(triangle1);
        info.rectanglePerimeterInfo(rectangle1);

    }
}
