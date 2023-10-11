public class Main {
    public static void main(String[] args) {
        final int numbers = 100;
        final int firstDivisor = 3;
        final int secondDivisor = 5;

        for (int i = 0; i < numbers; i++)
        {
            if ((i % firstDivisor == 0) && (i % secondDivisor == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % firstDivisor == 0) {
                System.out.println("Fizz");
            } else if (i % secondDivisor == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}