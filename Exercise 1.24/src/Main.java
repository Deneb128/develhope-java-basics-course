import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int myArr[] = new int[15];
        Random r = new Random();

        for(int i = 0; i < myArr.length; ++i){
            myArr[i] = (r.nextInt(10));
        }

        int[] noDuplicatesArr = removeDuplicates(myArr);

        for (var value : noDuplicatesArr)
            System.out.print(value + " ");

    }

    public static int[] removeDuplicates(int a[])
    {
        final int n = a.length;

        if (n == 0 || n == 1) {
            return a;
        }
        Arrays.sort(a); //we sort the array
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (a[i] != a[i + 1]) //if the next element is different, add the i-th element to the array
            {
                temp[j] = a[i];
                ++j;
            }
        }
        temp[j++] = a[n-1];
        int[] newArray = new int[j]; //create the new array from the size we just found

        for(int i = 0; i < j; i++) {
            newArray[i] = temp[i];
        }

        return newArray; //return newArray
    }
}
