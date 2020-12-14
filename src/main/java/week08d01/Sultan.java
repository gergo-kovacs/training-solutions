package week08d01;


public class Sultan {


    public static void main(String[] args) {
       Sultan sultan = new Sultan();
        for (boolean b:sultan.openDoors()) {
            System.out.print(b+" ");
        }
    }
    /*
     A török szultán elhatározza, hogy a 100 nap múlva lévő születésnapján szabadon enged néhány rabot a börtönéből.
     A börtönben 100 cella van. Mindegyik cella zárva van. Ha egyet fordítunk a kulcson akkor nyitva lesz,
     ha még egyet akkor zárva ha hármat akkor ismét nyitva és így tovább.
     A szultán azt a parancsot adja, hogy az első nap mindegyik cellán fordítsanak egyet.
     (Ekkor minden cella nyitva lesz) A második napon minden másodikon fordítsanak egyet,
     így minden második zárva lesz. A harmadik napon minden harmadikon fordítsanak egyet így a 3. cella zárva ,
     de a 6. cella például nyitva lesz. A week08d01.Sultan osztályba írj egy metódust openDoors() néven,
     aminek visszatérési értékéből kiderül,
     hogy mely ajtók lesznek nyitva a 100. napon! Az osztály szabadon bővíthető!
    */

    public boolean[] openDoors(){
      boolean[] doors = new boolean[100];
        for (int i= 0; i < 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if((i+1) % j == 0){
                    doors[i] = !doors[i];
                }
            }
        }
        return doors;
    }

}
