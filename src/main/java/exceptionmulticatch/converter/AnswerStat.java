package exceptionmulticatch.converter;

import java.util.logging.Logger;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String binaryString){
        try{
             return binaryStringConverter.binaryStringToBooleanArray(binaryString);
            }catch (NullPointerException | IllegalArgumentException iex){
                throw new InvalidBinaryStringException(iex);
        }

    }

    public int answerTruePercent(String answers){
        boolean[] array = convert(answers);
        int counter=0;
        for (boolean b : array) {
            if (b) {
                counter++;
            }
        }
        return (int) ((double) counter / array.length * 100);
    }
}
