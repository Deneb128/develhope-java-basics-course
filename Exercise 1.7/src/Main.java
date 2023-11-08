public class Main {
    public static void main(String[] args) {
        final double x = 1.0;
        final double y = 2.0;
        final double z = 4.0;
        System.out.println("avg between (" + x + "-" + y + "-" + z + ") -> " + calcAvg(x,y,z));
    }

    public static double calcAvg(double x, double y, double z) {
        return (x + y + z) / 3
    }
}
