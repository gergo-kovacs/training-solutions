package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");

        int number = scanner.nextInt();

        if (number % 3 == 0 && number != 0){
            System.out.println("3-mal osztható");
        }else{
            System.out.println("Nem osztható 3-mal.");
        }

    }

}
