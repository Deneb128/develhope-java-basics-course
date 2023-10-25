public class Rectangle extends Form {
    private int sideA = 0;
    private int sideB = 0;
    Rectangle(int _sideA, int _sideB)
    {
        this.sideA = _sideA;
        this.sideB = _sideB;
    }

    @Override
    public double calculateArea()
    {
        return this.sideA * this.sideB;
    }

    public void printArea()
    {
        System.out.println("Area of rectangle: " + calculateArea());
    }

}