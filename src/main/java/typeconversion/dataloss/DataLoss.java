package typeconversion.dataloss;

public class DataLoss {

    public static void dataLoss(){

        long oldLongNumber = 0;
        int counter=0;

        do {
         long newLongNumber =(long) (float) oldLongNumber;

            if(newLongNumber!=oldLongNumber){
                System.out.println(Long.toBinaryString(oldLongNumber)+" "+Long.toBinaryString(newLongNumber));
                counter++;
            }
            oldLongNumber++;
        }while(counter<3);

    }

    public static void main(String[] args) {
        DataLoss.dataLoss();
    }



}
