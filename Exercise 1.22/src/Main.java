public class Main {
    public static void main(String[] args)
    {
        createAndPrintArray();
    }

    public static void createAndPrintArray() { //let's be real, main was already the "method"..
        int[] myArr = {0,0,0,0,0,0,0,0,0,0};
        int sum = 0;
        for(int i = 1; i <= myArr.length; ++i)
        {
            sum =+ i;
            myArr[i-1] = i;
        }

        for(int value : myArr){
            System.out.println(value);
        }
        System.out.println("Sum of array: " + sum);
    }
}
