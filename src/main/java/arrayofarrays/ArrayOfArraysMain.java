package arrayofarrays;

public class ArrayOfArraysMain {
    public static void main(String[] args) {

        multiplicationTable(4);

        int[][] theArray = {{3, 2, 3}, {1, 1}, {5, 5, 5}};
        printArrayOfArrays(theArray);

        System.out.println();

        triangularMatrix(4);

        System.out.println("\n");

        getValues();


    }

    public static int[][] multiplicationTable(int size){
        int table[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (j+1)*(i+1);
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        return table;
    }

    public static void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }

        }

    }

    public static int[][] triangularMatrix(int size){
        int[][]tomb = new int[size][size];
        for (int i = 0; i < tomb.length; i++) {
            System.out.println();
            for (int j = 0; j < i+1; j++) {
                tomb[i][j]=i;
                //System.out.print( i+" ");
                System.out.print(tomb[i][j]+" ");
            }

        }

        return tomb;
    }

    public static int[][] getValues(){
        int[] monthsOfYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] year = new int[12][];

        for (int i = 0; i < 12; i++) {
                year[i] = new int[monthsOfYear[i]];
                System.out.print(year[i].length+" ");
        }

        return year;
    }

    /*
    január     31
    február    28
    március    31
    április    30
    május      31
    június     30
    július     31
    augusztus  31
    szeptember 30
    október    31
    november   30
    december   31
    */


}
