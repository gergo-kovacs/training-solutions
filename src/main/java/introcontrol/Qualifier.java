package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>100){
            System.out.println("Nagyobb, mint száz.");
        }else if(number==100){
            System.out.println("100");
        }else{
            System.out.println("100");
        }
    }
}
