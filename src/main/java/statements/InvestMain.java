package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mekkora összeget szeretne befektetni?");
        int fund = scanner.nextInt();
        System.out.println("Adja meg a kamatlábat!");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund,interestRate);

        System.out.println("Tőke: "+investment.getFund());
        System.out.println("Hozam 50 napra:"+investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: "+investment.close(80));
        System.out.println("Kivett összeg 90 nap után: "+investment.close(90));
    }
}
