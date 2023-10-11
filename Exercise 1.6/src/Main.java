public class Main {
    public static void main(String[] args) {
        final int x = 5;
        final int y = 7;

        //String formattedString = String.format("%.02f", Division(x,y));
        //System.out.println("x + y -> " + formattedString);
        System.out.println("x + y -> " + Division(x,y));

    }

    /*public static double Division(int x, int y)
    {
        return (double)x/(double)y;
    }*/

    public static int Division(int x, int y)
    {
        return (int)((double)x/(double)y);
    }
}