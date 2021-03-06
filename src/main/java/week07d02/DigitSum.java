package week07d02;


import java.util.List;

public class DigitSum {



    public int sumOfDigits(int x){
        String numbers = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            sum += numbers.charAt(i)-48;
        }
        return sum;
    }

    public int sumOfDigits2(int x){
        String numbers = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        return sum;
    }

    public int sumOfDigits3(int x){
        int sum = 0;
        while (x!=0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }



}
