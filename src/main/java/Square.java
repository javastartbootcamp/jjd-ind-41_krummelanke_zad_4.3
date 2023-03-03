class Square {
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    private double calculateSquareArea() {
        return sideLenght * sideLenght;
    }

    public void squareAreaInfo() {
        double squareArea = calculateSquareArea();
        System.out.println("Pole kwadratu o boku równym " + sideLenght + " cm wynosi: " + squareArea + " cm2");
    }
}
