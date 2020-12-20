package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b){

        int maradek = a%b;
        while(maradek!=0){
            a=b;
            b=maradek;
            maradek=a%b;

        }

        return b;
    }
}
