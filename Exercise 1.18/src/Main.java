public class Main {
    public static void main(String[] args) {
        final int number = 7;
        System.out.println("Multiplication table of " + number + " is:");
        printMultiplicationTable(number);
        System.out.println(multiplicationTableAsString(number));

    }

    public static void printMultiplicationTable(int n) {
        for(int i = 0; i <= 10; ++i){
            System.out.println(i + "*" + n + " = " + i*n);
        }
    }

    public static String multiplicationTableAsString(int n) {
        String multiplicationTable = "";
        for(int i = 0; i <= 10; ++i){
            multiplicationTable += i + "*" + n + " = " + i*n + "\n";
        }
        return multiplicationTable;
    }
}
