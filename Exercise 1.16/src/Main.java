public class Main {
    public static void main(String[] args) {
        final char operator = '+';

        System.out.println(operator + " is the " + GetOperatorName(operator) + " operator.");

    }

    public static String GetOperatorName(char operator)
    {
        switch (operator)
        {
            case '+':
                return "addition";
            case '-':
                return "subtraction";
            case '*':
                return "multiplication";
            case '/':
                return "division";
            default:
                return "Error";
        }
    }
}