public class Main {
    public static void main(String[] args) {
        final int x = 5;
        final int y = 7;

        System.out.println(x + " and " + y + " are " + (Compare(x,y) ? "different" : "equal") + ".");
    }

    public static Boolean Compare(int x, int y)
    {
        if( x != y){
            return true;
        }
        return false;
    }
}