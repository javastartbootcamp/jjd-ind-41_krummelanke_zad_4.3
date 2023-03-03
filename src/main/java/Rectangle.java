class Rectangle {
    private double longLenght;
    private double shortLenght;

    public Rectangle(double longLenght, double shortLenght) {
        this.longLenght = longLenght;
        this.shortLenght = shortLenght;
    }

    private double calculateRectanglePerimeter() {
        return 2 * longLenght + 2 * shortLenght;
    }

    public void rectanglePerimeterInfo() {
        double rectanglePerimeter = calculateRectanglePerimeter();
        System.out.println("Obwód prostokąta o bokach: " + longLenght
                + " cm, " + shortLenght + " cm, " + "wynosi: " + rectanglePerimeter + " cm");
    }

}