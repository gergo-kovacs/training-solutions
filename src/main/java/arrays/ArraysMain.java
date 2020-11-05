package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());
        arraysMain.multiplicationTableAsString(5);
        double day[] = {1.2, 4.5, 9.10};
        double anotherday[] = {1.2, 4.5, 9.11};
        arraysMain.sameTempValues(day, anotherday);
        int[] lotto1 = {10, 12, 2, 30, 44};
        int[] lotto2 = {10, 12, 30, 2, 44};
        System.out.println(arraysMain.wonLottery(lotto1,lotto2));
    }

    public String numberOfDaysAsString() {

        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        List<String> days = new ArrayList<>();
        String[] theDaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday "};
        return Arrays.asList(theDaysOfWeek);
    }

    public void multiplicationTableAsString(int size) {

        int table[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (j + 1) * (i + 1);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        String line = Arrays.deepToString(table);
        System.out.println(line);

    }

    public void sameTempValues(double[] day, double[] anotherDay) {
        System.out.println(Arrays.equals(day, anotherDay));
    }

    public boolean wonLottery(int[] a, int[] b) {
        //Arrays.copyOf(a,a.length);
        //System.out.println(Arrays.copyOf(a,a.length).equals(a));
        // System.out.println(Arrays.toString(Arrays.copyOf(a,a.length)));
        return Arrays.equals(a,b);
    }

}

