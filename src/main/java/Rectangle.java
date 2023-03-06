class Rectangle {
    private double longLenght;
    private double shortLenght;

    public Rectangle(double longLenght, double shortLenght) {
        this.longLenght = longLenght;
        this.shortLenght = shortLenght;
    }

    public double rectanglePerimeter() {
        return 2 * longLenght + 2 * shortLenght;
    }

    public double getLongLenght() {
        return longLenght;
    }

    public double getShortLenght() {
        return shortLenght;
    }
}