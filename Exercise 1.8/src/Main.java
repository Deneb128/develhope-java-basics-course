public class Main {
    public static void main(String[] args) {
        final double x = 1.0;
        final double y = 2.0;
        System.out.println(func(x,y));
    }

    public static  double func(double x, double y)
    {
        final double inc = 3.0;
        x = x + inc;
        y = y + inc;
        return x*y;
    }
}