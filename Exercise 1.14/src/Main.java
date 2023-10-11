public class Main {
    public static void main(String[] args) {
        final String str = "Hello World";

        if (str.length() == 10){
            System.out.println("The string's \"" + str + "\" length is equal to 10");
            return;
        }
        System.out.println("The string's  \"" + str + "\" length is " + (str.length() > 10 ? "greater" : "less") + " than 10");

    }
}