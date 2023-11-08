import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        createAndPrintasFound();
    }

    public static void createAndPrintasFound() {
        char[] myArr = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        Random r = new Random();
        
        for(int i = 0; i < myArr.length; ++i){
            myArr[i] = (char)(r.nextInt(26) + 'a');
        }

        Boolean found = false;
        for(int i = 0; i < myArr.length; ++i)
        {
            if(myArr[i] == 'a') {
                found = true;
                System.out.println("Found 'a' at index: " + i);
            }
        }
        if(!found){
            System.out.println("No 'a' found");
        }
    }
}
