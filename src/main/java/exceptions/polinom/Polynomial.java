package exceptions.polinom;

import java.util.Arrays;
import java.util.Random;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if(coefficients==null){
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;

    }

    public Polynomial(String[] coefficients) {

        if(coefficients==null){
            throw new NullPointerException("coefficientStrs is null");
        }
        double[] convertToDouble = new double[coefficients.length];
        for (int i = 0; i <coefficients.length ; i++) {
            try{
                convertToDouble[i] = Double.parseDouble(coefficients[i]);
            }catch (NumberFormatException e){
                throw new IllegalArgumentException("Illegal coefficients, not a number",e);
            }
        }
        this.coefficients = convertToDouble;
    }

    public double evaluate(double x){
        int n = coefficients.length - 1;
        double sum = 0;
        for (int j = n; j >= 0; j--) {
            sum += coefficients[j] * Math.pow(x,(double)n - j);
        }
        return sum;
    }

    public double[] getCoefficients() {
        return coefficients;
    }


}
