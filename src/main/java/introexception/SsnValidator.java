package introexception;

public class SsnValidator {

    public boolean isValidSsn(String sNumber){
        if(sNumber.equals("") || sNumber==null || sNumber.length()!=9 ){
            return false;
        }
        int numbers[] = new int[9];
        int n=0;
        for (int i = 0; i < 9; i++) {
            n= sNumber.charAt(i)-48;
            if(((i)%2==0 || i==0) && i!=1 ){
                numbers[i]=n*7;
            }else{
                numbers[i]=n*3;
            }
        }
        int sum= 0;
        for (int k:numbers) {
            System.out.print(k+" ");
            sum += k;
        }
        int endN = sNumber.charAt(8)-48;
        if((endN)==(sum%10)){
            return true;
        }else{
            return false;
        }
    }
}
