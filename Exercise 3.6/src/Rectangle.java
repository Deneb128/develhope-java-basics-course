public class Rectangle extends Form {
    private int sideA = 0;
    private int sideB = 0;
    private int area = 0;
    private final FormEnum myForm = FormEnum.RECTANGLE;

    Rectangle(){};
    Rectangle(int _sideA, int _sideB)
    {
        this.sideA = _sideA;
        this.sideB = _sideB;
        //calculateArea();
    }

    public void calculateArea()
    {
        this.area = this.sideA * this.sideB;
        System.out.println("Area of Rectangle is: " + this.area); //for the exercise asking to print it with calculateArea
    }

    public void printForm()
    {
        System.out.println("I am a " + super.getFormString(myForm));
    }

}