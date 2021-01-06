package exam02;

public class ArraySelector {

    public String selectEvens(int[] array){
        if(isEmpty(array)){
            return "";
        }
        String result = "[";
        if(array.length==1){
            return result+array[0]+"]";
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                result += array[i];
                result +=", ";
            }
        }
        result=result.substring(0,result.length()-2);
        return result+"]";
    }

    private boolean isEmpty(int[] array){
        return array.length==0;
    }


}
