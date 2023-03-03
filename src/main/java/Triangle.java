class Triangle {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;

    }

    private double calculateTrianglePerimeter() {
        return edgeA + edgeB + edgeC;
    }

    public void trianglePerimeterInfo() {
        double trianglePerimeter = calculateTrianglePerimeter();
        System.out.println("Obwód trójkąta o bokach: " + edgeA + " cm, "
                + edgeB + " cm, " + edgeC + " cm, "
                + "wynosi: " + trianglePerimeter + " cm");
    }

}