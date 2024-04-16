package lab2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class matrix {

    private static final int MIN_RAND_VELUE = -10;
    private static final int MAX_RAND_VELUE = 10;

    public static void main(String[] args) {
        int w, h;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter width of matrix: ");
        w = scanner.nextInt();
        System.out.println("Please, enter height of matrix: ");
        h = scanner.nextInt();

        if (w <= 0 || w > 20 || h < +0 || h > 20) {
            System.out.println("Wrong size for matrix");
            return;
        }

        System.out.println("Would do you like to create matrix manually or rendomly? (m/r)");
        if (scanner.next().equals("m")) {
            matrix = createrMatrixMan(w, h);
        } else {
            matrix = createrMatrixRand(w, h);
        }

        showMatrix(matrix);

        int minVal = getMinVal(matrix);
        int maxVal = getMaxVal(matrix);
        double aveArithmeticVal = getAveArithmeticVal(matrix);
        double aveGeometricVal = gerAveGeometricVal(matrix);
        System.out.println("Minimum value: " + minVal);
        System.out.println("Maximum value: " + maxVal);
        System.out.println("Average arithmetic value: " + aveArithmeticVal);
        System.out.println("Average geometric value: " + aveGeometricVal);

    }

    private static int[][] createrMatrixMan(int w, int h) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[w][h];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] createrMatrixRand(int w, int h){
        int[][]matrix = new int [w][h];
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                matrix[i][j]=generRandVal();
            }
        }
        return matrix;
    }


    private static int generRandVal(){
        return (int) (Math.random()*(MAX_RAND_VELUE - MIN_RAND_VELUE + 1))+MIN_RAND_VELUE;
    }

    private static void showMatrix(int[][]matrix){
        int w = matrix.length;
        int h = matrix[0].length;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
    }

    private static int getMinVal(int[][] matrix){
        int minVal = matrix[0][0];
        int w = matrix.length;
        int h = matrix[0].length;

        for (int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(matrix[i][j] < minVal) minVal = matrix[i][j];
            }
        }
        return minVal;
    }

    private static int getMaxVal(int[][] matrix){
        int maxVal = matrix[0][0];
        int w = matrix.length;
        int h = matrix[0].length;

        for (int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(matrix[i][j] > maxVal) maxVal = matrix[i][j];
            }
        }
        return maxVal;
    }

    private static double getAveArithmeticVal(int[][] matrix){
        double aveArithmeticVal = 0;
        int w = matrix.length;
        int h = matrix[0].length;
        int elemCount = 0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                aveArithmeticVal += matrix[i][j];
                elemCount++;
            }
        }
        aveArithmeticVal /= elemCount;
        return aveArithmeticVal;
    }

    private static double gerAveGeometricVal (int [][] matrix){
        double aveGeometricVal = 1;
        int w = matrix.length;
        int h = matrix[0].length;
        int elemCount = 0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                aveGeometricVal *= matrix[i][j];
                elemCount++;
            }
        }
        aveGeometricVal = Math.pow(aveGeometricVal, 1.0 / elemCount);
        return aveGeometricVal;
    }
}
