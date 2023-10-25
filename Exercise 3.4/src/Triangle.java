public class Triangle extends Form {
    private int base = 0;
    private int height = 0;
    Triangle(int _base, int _height)
    {
        this.base = _base;
        this.height = _height;
    }

    @Override
    public double calculateArea()
    {
        return (double)this.base * (double)this.height/2.0;
    }

    public void printArea()
    {
        System.out.println("Area of triangle: " + calculateArea());
    }

}