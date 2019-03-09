package _5_matrix;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */
public class Matrix {
    private int row;
    private int column;
    private int[][] elements;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.elements = new int[row][column];
    }

    public Matrix(int length) {
        this.row = length;
        this.column = length;
        this.elements = new int[length][length];
    }

    public Matrix(int[][] elements) {
        this.row = elements.length;
        this.column = elements[0].length;
        this.elements = elements;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getElements() {
        return elements;
    }

    public boolean add(Matrix newMatrix) {
        int rowLength = elements.length;
        int columnLength = elements[0].length;
        if ((newMatrix.getRow() == row && newMatrix.getColumn() == column) ||
                (newMatrix.getElements().length == rowLength && newMatrix.getElements()[0].length == columnLength)) {
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                    elements[i][j] += newMatrix.getElements()[i][j];
                }
            }
            return true;
        }else
            return false;
    }

    public void setElement(int i, int j, int value) {
        if (i <= row && j <= column)
            this.elements[i][j] = value;
    }

    public boolean isSquareMatrix() {
        if(this.row == this.column)
            return true;
        else
            return false;
    }

    public void toLowerTriangular() {
        if(isSquareMatrix()){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    if (j > i)
                        elements[i][j] = 0;
                }
            }
        }
    }

    public void toUpperTriangular() {
        if(isSquareMatrix()){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    if (j < i)
                        elements[i][j] = 0;
                }
            }
        }
    }

    public void printArray(int[][] arrary){
        for (int i = 0; i < arrary.length; i++){
            for (int j = 0; j < arrary[0].length; j++){
                System.out.print(" "+ arrary[i][j]);
            }
            System.out.println();
        }
    }

}

