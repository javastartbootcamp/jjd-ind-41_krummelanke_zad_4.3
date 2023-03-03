class ShapeCalculator {

    private double calculateSquareArea(Square square) {
        return square.getSideLenght() * square.getSideLenght();
    }

    public void squareAreaInfo(Square square) {
        ShapeCalculator calc = new ShapeCalculator();
        double squareArea = calc.calculateSquareArea(square);
        System.out.println("Pole kwadratu o boku równym " + square.getSideLenght() + " cm wynosi: " + squareArea + " cm2");
    }

    private double calculateCircleArea(Circle circle) {
        return 3.14159 * circle.getRadius() * circle.getRadius();
    }

    public void circleAreaInfo(Circle circle) {
        ShapeCalculator calc = new ShapeCalculator();
        double circleArea = calc.calculateCircleArea(circle);
        System.out.println("Pole koła o promieniu równym " + circle.getRadius() + " cm wynosi: " + circleArea + " cm2");
    }

    private double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getEdgeA() + triangle.getEdgeB() + triangle.getEdgeC();
    }

    public void trianglePerimeterInfo(Triangle triangle) {
        ShapeCalculator calc = new ShapeCalculator();
        double trianglePerimeter = calc.calculateTrianglePerimeter(triangle);
        System.out.println("Obwód trójkąta o bokach: " + triangle.getEdgeA() + " cm, "
                + triangle.getEdgeB() + " cm, " + + triangle.getEdgeC() + " cm, "
                + "wynosi: " + trianglePerimeter + " cm");
    }

    private double calculateRectanglePerimeter(Rectangle rectangle) {
        return 2 * rectangle.getLongLenght() + 2 * rectangle.getShortLenght();
    }

    public void rectanglePerimeterInfo(Rectangle rectangle) {
        ShapeCalculator calc = new ShapeCalculator();
        double rectanglePerimeter = calc.calculateRectanglePerimeter(rectangle);
        System.out.println("Obwód prostokąta o bokach: " + rectangle.getLongLenght()
                + " cm, " + rectangle.getShortLenght() + " cm, " + "wynosi: " + rectanglePerimeter + " cm");
    }

}
