package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {


    public static void main(String[] args) {
       Sultan sultan = new Sultan();


       int[] pk = new int[10];
        for (int i = 0; i < 10; i++) {
            pk[i]=-1;
        }
        for (int i = 1; i <= 10; i++) {
            if(i%3==0) pk[i]*=-1;
            System.out.println(pk[i]);
        }
        for (int i:sultan.openDoors()) {
            System.out.print(i+" ");
        }

    }
    /*
    * A török szultán elhatározza, hogy a 100 nap múlva lévő születésnapján szabadon enged néhány rabot a börtönéből.
    *  A börtönben 100 cella van. Mindegyik cella zárva van. Ha egyet fordítunk a kulcson akkor nyitva lesz,
    *  ha még egyet akkor zárva ha hármat akkor ismét nyitva és így tovább.
    A szultán azt a parancsot adja, hogy az első nap mindegyik cellán fordítsanak egyet.
*   (Ekkor minden cella nyitva lesz) A második napon minden másodikon fordítsanak egyet,
*   így minden második zárva lesz. A harmadik napon minden harmadikon fordítsanak egyet így a 3. cella zárva ,
*   de a 6. cella például nyitva lesz. A week08d01.Sultan osztályba írj egy metódust openDoors() néven,
*   aminek visszatérési értékéből kiderül,
*   hogy mely ajtók lesznek nyitva a 100. napon! Az osztály szabadon bővíthető!
    * */
    public int[] openDoors(){
        int[] doors = new int[100];

        for (int i = 0; i < 10; i++) {
            doors[i]=1;
        }

        int r=1;
        while(r<=100){
            if(r%2==0){
                for (int i = 0; i < 100; i+=2) {
                    doors[i]*=-1;
                }
            }
            else if(r%3==0){
            for (int i = 0; i < 100; i+=3) {
                doors[i]*=-1;
            }
            }else{
            for (int i = 0; i < 100; i++) {
                doors[i]*=-1;
            }
            }

            r++;
        }
        return doors;

    }
}
