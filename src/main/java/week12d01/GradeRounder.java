package week12d01;

public class GradeRounder {

    /*Készíts egy GradeRounder osztályt, amiben van egy int[] roundGrades(int[] grades) metódus.
    A grades tömb pontszámokat tartalmaz 0 és 100 között. A feladat az,
    hogy kerekítsük a benne lévő számokat a következő szabály szerint:
    Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3,
    akkor kerekítsük fel a számot az 5 következő többszörösére.
    Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket egyáltalán nem kell kerekíteni.
    Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.
    */

    public static void main(String[] args) {
        GradeRounder rounder = new GradeRounder();
        int[] t = new int[100];
        for (int i = 0; i < t.length; i++) {
            t[i]= (int) (Math.random()*100+1);
        }

        int[] e = rounder.roundGrades(t);
        for (int i:t) {
            System.out.print(i+"|");
        }
        System.out.println("\n");
        for (int i:e) {
            System.out.print(i+"|");
        }
    }

    public int[] roundGrades(int[] grades){
        int[] rounded = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
                rounded[i]=divison(grades[i]);
        }
        return rounded;
    }

    private int divison(int n){
        if(n<40){
            return n;
        }else{
            if(n%5!=0){
                if((n%5)>=3){
                    return (n-(n%5))+5;
                }else if((n%5)<3){
                    return n-(n%5);
                }
            }else{
                 n=n+5;
            }
        }
    return n;
    }

}
