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
        System.out.println("Matrix in input: \n" + printMatrix(myMatrix));
        System.out.println("Matrix reversed: \n" + printMatrix(reverseMatrix(myMatrix)));
    }

    public static int[][] reverseMatrix(int[][] matrix)
    {
        final int rowLength = matrix.length;
        final int columnLength = matrix[0].length;
        int[][] newMatrix = new int[columnLength][rowLength];
        for (int i = 0; i < matrix.length; ++i)
        {
            for (int j = 0; j < matrix[i].length; ++j) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
    public static String printMatrix(int[][] matrix)
    {
        String str = "";
        for (int i = 0; i < matrix.length; ++i)
        {
            for (int j = 0; j < matrix[i].length; ++j)
            {
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