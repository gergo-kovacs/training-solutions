package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString){

        if(!isBinaryNumbers(binaryString)){
            throw new IllegalArgumentException();
        }
        boolean[] result = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i)=='0'){
                result[i]=false;
            }else{
                result[i]=true;
            }
        }

        return result;
    }

    public String booleanArrayToBinaryString(boolean[] booleans){
        if(booleans.length==0){
            throw new IllegalArgumentException();
        }

        StringBuilder result= new StringBuilder(booleans.length);
        for (int i = 0; i < booleans.length; i++) {
            if(booleans[i]){
                result.append('1');
            }else{
                result.append('0');
            }
        }

        return result.toString();
    }

    private boolean isBinaryNumbers(String numbers){

        for (int i = 0; i < numbers.length(); i++) {
            if(numbers.charAt(i)!='0'&& numbers.charAt(i)!='1'){
               return false;
            }
        }
        return true;
    }
}
