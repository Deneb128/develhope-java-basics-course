import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int myMatrix[][] = new int[5][2];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < myMatrix.length; ++i) {
            for (int j = 0; j < myMatrix[i].length; ++j) {
                int number = (r.nextInt(10));
                if (i == 0) {
                    sum += number;
                }
                myMatrix[i][j] = number;
            }
        }
        System.out.println("The sum of the first row of the matrix: \n" + printMatrix(myMatrix) + "\nis " + sum);
    }

    public static String printMatrix(int[][] matrix)
    {
        String str = "";
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if(j == matrix[i].length - 1) {
                    str += matrix[i][j] + "\n";
                } else {
                    str += matrix[i][j] + "-";
                }
            }
        }
       return str;
    }
}