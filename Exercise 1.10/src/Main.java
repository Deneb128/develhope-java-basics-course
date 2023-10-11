public class Main {
    public static void main(String[] args) {
        final char x = 'x';
        final char y = 'y';

        System.out.println(x + " and " + y + " are " + (Compare(x,y) ? "different" : "equal") + ".");
    }

    public static Boolean Compare(char x, char y)
    {
        if( x != y){
            return true;
        }
        return false;
    }
}