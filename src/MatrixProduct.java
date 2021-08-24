import java.util.Scanner;
public class MatrixProduct {
    public static void main(String[] args) {
        Scanner zve = new Scanner(System.in);
        System.out.println(" Please enter number of rows of the first matrix");
        int rowNumber1 = zve.nextInt();
        System.out.println(" Please enter number of columns of the first matrix");
        int colNumber1 = zve.nextInt();
        System.out.println(" Please enter number of rows of the second matrix");
        int rowNumber2 = zve.nextInt();
        System.out.println(" Please enter number of columns of the second matrix");
        int colNumber2 = zve.nextInt();
        Matrix matrices = new Matrix(rowNumber1,colNumber1,rowNumber2,colNumber2);
        matrices.fillMatrix1();
        matrices.fillMatrix2();
        matrices.print();
        matrices.multiply();
        matrices.printProduct();




    }
}