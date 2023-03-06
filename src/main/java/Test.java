class Test {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println("Pole kwadratu o boku równym " + square1.getSideLenght() + " cm wynosi: "
                + square1.squareArea() + " cm2");

        Circle circle1 = new Circle(4.75);
        System.out.println("Pole koła o promieniu równym " + circle1.getRadius() + " cm wynosi: "
                + circle1.circleArea() + " cm2");

        Triangle triangle1 = new Triangle(2, 3, 4);
        System.out.println("Obwód trójkąta o bokach: " + triangle1.getEdgeA() + " cm, "
                + triangle1.getEdgeB() + " cm, " + triangle1.getEdgeC() + " cm, "
                + "wynosi: " + triangle1.trianglePerimeter() + " cm");

        Rectangle rectangle1 = new Rectangle(10, 20);
        System.out.println("Obwód prostokąta o bokach: " + rectangle1.getLongLenght()
                + " cm, " + rectangle1.getShortLenght() + " cm, " + "wynosi: "
                + rectangle1.rectanglePerimeter() + " cm");
    }
}
