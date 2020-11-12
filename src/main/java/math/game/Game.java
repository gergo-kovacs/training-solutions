package math.game;

public class Game {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("Mimran",new Point(5,2));
        Warrior warrior2 = new Warrior("Harold",new Point(9,9));

        System.out.println(warrior1);
        System.out.println(warrior2);

        int round = 1;
        while(warrior1.isAlive() && warrior2.isAlive()){
            System.out.println(round);

            while(warrior1.distance(warrior2)>0){
                warrior1.move(warrior2);
                warrior2.move(warrior1);
                System.out.println(warrior1);
                System.out.println(warrior2);
            }

            if(warrior2.isAlive()){

                warrior1.attack(warrior2);
            }
            if(warrior1.isAlive()){
                warrior2.attack(warrior1);
            }
            System.out.println(warrior1);
            System.out.println(warrior2);
            round++;
        }

        System.out.println("Winner: "+ (warrior1.isAlive() ? warrior1 : warrior2));

    }

}
