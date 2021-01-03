package week09d02;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        System.out.println(fibCalculator.sumEvens(10));
    }
    public long sumEvens(int bound){

        long fib=0;
        long fib1 = 1;
        long fib2 = 2;
        long sum = fib2;
        while(fib<=bound){
            fib = fib1+fib2;
            if(fib>=bound){
                break;
            }
            if(fib%2==0){
                sum += fib;
            }
            fib1 = fib2;
            fib2 = fib;
        }
        return sum;
    }
}
