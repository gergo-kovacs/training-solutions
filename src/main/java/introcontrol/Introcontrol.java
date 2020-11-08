package introcontrol;

public class Introcontrol {

    public int substractTenIfGreaterThanTen(int number){
        return number<=10 ? number : number-10;
    }

    public String describeNumber(int number){
        return number == 0 ? "zero" : "not zero";
    }

    public String greetingToJoe(String name){
        return name.equals("Joe") ? "Hello Joe" : "";
    }

    public int calculateBonus(int sale){
        return sale>=1000000 ? (sale/10) : 0;
    }

    public int calculateConsumption(int prev, int next){
        return next<=prev ? next-prev : prev-Math.abs(10000-next);
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void printNumbersBetween(int min, int max){
        for (int i = min; i < max; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {

        if(a<b) {
            for (int i = a; i < b; i++) {
                System.out.print(i + " ");
            }
        }else{
            for (int i = a; i > b ; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void printOddNumbers(int max){
        for (int i = 1; i <= max; i++) {
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }




}
