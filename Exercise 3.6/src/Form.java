class Form
{
    enum FormEnum
    {
        RECTANGLE,
        TRIANGLE,
    }
    public String getFormString(FormEnum form)
    {
        switch(form)
        {
            case RECTANGLE:
                return "RECTANGLE";
            case TRIANGLE:
                return "TRIANGLE";
            default:
                return "SIMPLE FORM";
        }
    }
    public void calculateArea(){};
}