public class Main {
    public static void main(String[] args)
    {
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
