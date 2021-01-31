package week03d05;

import java.util.Scanner;

// 112+324 = sum

public class Operation {

    private int leftValue;
    private int rightValue;

    public Operation(String sum) {
        this.leftValue = Integer.parseInt(sum.substring(0,sum.indexOf("+")).trim());
        this.rightValue = Integer.parseInt(sum.substring(sum.indexOf("+")));

    }

    public int getResult(){

        return leftValue+rightValue;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Operation operation = new Operation(scan.nextLine());

        System.out.println(operation.getResult());
    }
}
