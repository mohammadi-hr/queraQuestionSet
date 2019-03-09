package _5_matrix;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */
public class Main {
    public static void main(String[] args) {
        int[][] squreMatrix = {{12,10,2},{45,-5,5},{7,-7,11}};
        int[][] squreMatrix2 = {{12,10,2},{45,-5,5},{7,-7,11}};
        Matrix matrix = new Matrix(squreMatrix);
        Matrix matrix2 = new Matrix(squreMatrix2);

        System.out.println(matrix.getColumn());
        matrix.add(matrix2);

        matrix.setElement(1,1,55);
        matrix.printArray(squreMatrix);
    }
}
