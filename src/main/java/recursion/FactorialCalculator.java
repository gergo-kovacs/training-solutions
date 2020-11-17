package recursion;

public class FactorialCalculator {
    public long getFactorial(int n){
        while(n>1){
            long solution = getFactorial(n-1);
            return n * solution;
        }
        return 1;
    }
}
