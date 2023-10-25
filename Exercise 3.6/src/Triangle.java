public class Triangle extends Form {
    private int base = 0;
    private int height = 0;
    private double area = 0;

    private final FormEnum myForm = FormEnum.TRIANGLE;

    Triangle(){};
    Triangle(int _base, int _height)
    {
        this.base = _base;
        this.height = _height;
    }

    public void calculateAre()
    {
        this.area = (double)this.base * (double)this.height / 2.0;
    }


    public void printForm()
    {
        System.out.println("I am a " + super.getFormString(myForm));
    }
}
