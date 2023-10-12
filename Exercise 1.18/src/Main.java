public class Main {
    public static void main(String[] args) {
        final int number = 7;
        System.out.println("Multiplication table of " + number + " is:");
        for(int i = 0; i <= 10; ++i){
            System.out.println(i + "*" + number + " = " + i*number);
        }
    }
}