class Square {
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public double squareArea() {
        return sideLenght * sideLenght;
    }

    public double getSideLenght() {
        return sideLenght;
    }
}
