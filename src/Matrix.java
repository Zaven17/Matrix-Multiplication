import java.util.Scanner;
public class Matrix {

    //Instance Variables
    Scanner zvo = new Scanner(System.in);
    private int numberOfRows1;
    private int numberOfColumns1;
    private int numberOfRows2;
    private int numberOfColumns2;
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] product;

    //Constructor Method
    public Matrix(int numberOfRows1, int numberOfColumns1, int numberOfRows2 , int numberOfColumns2){
        this.numberOfRows1 = numberOfRows1;
        this.numberOfColumns1 = numberOfColumns1;
        matrix1 = new int[numberOfRows1][numberOfColumns1];
        this.numberOfRows2 = numberOfRows2;
        this.numberOfColumns2= numberOfColumns2;
        matrix2 = new int[numberOfRows2][numberOfColumns2];
        product = new int[numberOfRows1][numberOfColumns2];
    }

    //these are the accessor and mutator methods for Entries of Matrix1 and Matrix2 and Product Matrix
    private void setEntryFromMatrix1(int numberOfColumns1, int numberOfRows1, int value){
        this.matrix1[numberOfRows1][numberOfColumns1] = value;
    }
    private int getEntryFromMatrix1(int numberOfColumns1, int numberOfRows1) {
        return this.matrix1[numberOfRows1][numberOfColumns1];
    }
    private int getEntryFromMatrix2(int numberOfColumns2, int numberOfRows2){
        return this.matrix2[numberOfRows2][numberOfColumns2];
    }
    private void setEntryFromMatrix2(int numberOfColumns2, int numberOfRows2, int value){
        this.matrix2[numberOfRows2][numberOfColumns2] = value;
    }
    private int getEntryFromProduct(int numberOfColumns, int numberOfRows){

        return this.product[numberOfRows][numberOfColumns];
    }
    private void setEntryInProduct(int numberOfColumns, int numberOfRows, int value){
        this.product[numberOfRows][numberOfColumns] = value;
    }
    public int[][] getMatrix1(){
        return this.matrix1;
    }
    public int[][] getMatrix2(){
        return this.matrix2;
    }

    //Multiplies two matrices
    public void multiply(){
        if(this.numberOfColumns1 != numberOfRows2){
            System.out.println("These Two Matrices Are not Multiplicable");
            System.exit(0);
        }
        else{
            int sum = 0;
            for(int i = 0; i < numberOfRows1; i++){
                for(int j = 0; j < numberOfColumns2;j++){
                    for (int k = 0; k < numberOfColumns1 ; k++){
                        sum += getEntryFromMatrix1(k,i) * getEntryFromMatrix2(j,k);
                    }
                    setEntryInProduct(j,i,sum);
                    sum = 0;
                }
            }
        }
    }

    //fillsMatrix1
    public void fillMatrix1(){
        for (int i = 0; i <this.matrix1.length ; i++) {
            for (int j = 0; j < this.matrix1[i].length; j++) {
                System.out.println("please enter the ii" + (i+1) + " "+ (j+1) +" th entry");
                setEntryFromMatrix1(j,i,zvo.nextInt());
            }
        }
    }

    //fillsMatrix2
    public void fillMatrix2(){
        for (int i = 0; i <this.matrix2.length ; i++) {
            for (int j = 0; j < this.matrix2[i].length; j++) {
                System.out.println("please enter the " + (i+1) + " " + (j+1) +" th entry");
                setEntryFromMatrix2(j,i,zvo.nextInt());
            }
        }
    }

    //private method print that prints the given matrix on the console
    private void print(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                    System.out.print("  " + m[i][j] + " \t ");
            }
            System.out.println( );
        }
    }

    //public overriden method print for privacy
    public void print(){
        System.out.println("Matrix Number One: ");
        print(matrix1);
        System.out.println("Matrix Number Two: ");
        print(matrix2);
    }

    //print method for product matrix
    public void printProduct(){
        System.out.println("Matrix Number One Times Matrix Number Two: ");
        print(product);
    }



}