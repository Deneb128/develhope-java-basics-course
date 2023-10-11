public class Main {
    public static void main(String[] args) {
        final int x = 5;
        final int y = 20;
        final int toCompare = 10;

        System.out.println(toCompare + (Compare(x,y, toCompare) ? " is" : " is not") + " between " + x + " and " + y + ".");
    }

    public static Boolean Compare(int left, int right, int toCompare)
    {
        if (toCompare > left && toCompare < right){
            return true;
        }
        return false;
    }
}