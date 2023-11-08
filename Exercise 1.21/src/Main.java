public class Main {
    public static void main(String[] args) {
        final int limit = 10;
        printTo(limit);
    }

    public static void printTo(int limit) {
        for (int i = 0; i < limit; ++i) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
