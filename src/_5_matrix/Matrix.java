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
    }

    public Matrix(int length){
        this.row = length;
        this.column = length;
    }

    public Matrix(int[][] elements){
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
        //TODO
    }

    public void setElement(int i, int j, int value){
        //TODO
    }

    public boolean isSquareMatrix() {
        //TODO
    }

    public void toLowerTriangular() {
        //TODO
    }

    public void toUpperTriangular() {
        //TODO
    }

}

