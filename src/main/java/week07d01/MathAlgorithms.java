package week07d01;


public class MathAlgorithms {


    public boolean isPrime(int x){
        for (int i = 2; i < x; i++) {
            if(x%i==0){
                 return false;
            }
        }
        return true;
    }
}
