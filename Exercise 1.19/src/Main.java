public class Main {
    public static void main(String[] args) {
        final int start = 7;
        final int counter = 9;
        printReverse(start,counter);
    }

    public static void printReverse(int start, int counter) {
        for(int i = 0; i < counter; ++i)
        {
            System.out.println(start-i);
        }
    }
}
