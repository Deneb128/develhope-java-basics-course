public class Main {
    public static void main(String[] args) {
        final int x = 5;
        System.out.println(x + (IsEven(x) ? " is" : " is not") + " even.");
    }

    public static Boolean IsEven(int x)
    {
        if (x % 2 == 0){
            return true;
        }
        return false;
    }
}