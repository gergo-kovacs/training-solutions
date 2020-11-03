package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] theDaysOfWeek = {"Monday" ,"Tuesday" ,"Wednesday" ,"Thursday" ,"Friday" ,"Saturday" ,"Sunday "};
        System.out.println(theDaysOfWeek[1]);

        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) Math.pow(2,i);
            System.out.print(n[i]+" ");
        }

        System.out.println();

        boolean[] trueOrFalse = new boolean[6];

        for (int i = 0; i < trueOrFalse.length; i++) {
            if(i%2 == 0 || i==0){
                trueOrFalse[i]=true;
            }else{
                trueOrFalse[i]=false;
            }
            System.out.print(trueOrFalse[i]+" ");
        }

        System.out.println();

        ArrayHandler itemFound = new ArrayHandler();
        System.out.println(itemFound.contains(n,16));

        System.out.println(itemFound.find(n,5));





    }
}
