package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(3.2 * 4.5)/2+10-3= ?");
        System.out.println("Eredmény?: ");
        double result = scan.nextDouble();

        double exact = (3.2 * 4.5)/2+10-3;
        if(Math.abs(result-exact) < 0.0001){
            System.out.println("helyes");
        }else{
            System.out.println("helytelen");
        }
        //System.out.println(exact);

    }
}
