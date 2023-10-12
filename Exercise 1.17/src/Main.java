public class Main {
    public static void main(String[] args) {
        int counter = 5;
        System.out.println("Summation 0 to " + (counter-1) + " is " + Summation(5));
    }


    public static int Summation(int n)
    {
        int sum = 0;
        int count = 1;
        while(count < n)
        {
            sum += count;
            ++count;
        }
        return sum;
    }
}