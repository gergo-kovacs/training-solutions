package primitivetypes;

public class PrimitiveTypes {

    public String toBinaryString(int n){
        String binary = new String();
        String correctBinary = new String();
        int i=n;

        do{
           n =  n/2;
           if(i%2!=0){
               binary+="1";
           }else{
               binary+="0";
           }
           i=n;
        }while(i>0);

        for (int j = 0; j <32-binary.length() ; j++) {
            correctBinary+=0;
        }
        for (int j = binary.length()-1; j >=0 ; j--) {
            correctBinary+=binary.charAt(j);
        }

       return correctBinary;
    }

}


