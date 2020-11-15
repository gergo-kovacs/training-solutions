package operators;

public class Operators {

    public boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public void multiplyByPowerOfTwo(int a,int b){
        int result = a << b;
        System.out.println(result);
    }
}
