class Test {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        square1.squareAreaInfo();

        Circle circle1 = new Circle(4.75);
        circle1.circleAreaInfo();

        Triangle triangle1 = new Triangle(2, 3, 4);
        triangle1.trianglePerimeterInfo();

        Rectangle rectangle1 = new Rectangle(10, 20);
        rectangle1.rectanglePerimeterInfo();

    }
}
