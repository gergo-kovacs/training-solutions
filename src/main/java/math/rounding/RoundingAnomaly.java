package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    public static void main(String[] args) {

        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();
        double sum = 0;

        for (int i = 0; i < 100; i++) {
            double dif = roundingAnomaly.difference(1000,1000000,5);
            sum += dif;
            System.out.println(dif);
        }

        System.out.println(sum / 100);

//        Random r = new Random();
//        double p = r.nextDouble()*1000000*Math.pow(10,5)/Math.pow(10,5);
//        System.out.println(p+"\n"+Math.round(Math.round(p)));

    }

    public double[] randomNumbers(int size, double max, int scale){

        double doubles[] = new double[size];
        Random rand = new Random();

        for (int i = 0; i < doubles.length; i++) {
            double v = Math.round(rand.nextDouble()*max*Math.pow(10,scale))/Math.pow(10,scale);
            doubles[i]=v;
        }
        return doubles;
    }

    public double roundAfterSum(double[] numbers){
        double sum=0.0;
        for (double d:numbers) {
            sum += Math.round(d);
        }
        return sum;
    }

    public double sumAfterRound(double[] numbers){
        double sum=0.0;
        for (double d:numbers) {
            sum += d;
        }
        return Math.round(sum);
    }

    public double difference(int size, double max, int scale) {

        double[] numbers = randomNumbers(size,max,scale);
        double resultA = roundAfterSum(numbers);
        double resultB = sumAfterRound(numbers);

        return Math.abs(resultA - resultB);
    }
}
