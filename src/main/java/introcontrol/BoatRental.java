package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Érkező csapat létszáma:");
        int team = scanner.nextInt();

        if(team>10){
            System.out.println("5 fős csónaokt elvitték.");
            System.out.println("3 fős csónaokt elvitték.");
            System.out.println("2 fős csónaokt elvitték.");
            System.out.println("Maradtak még a parton.");
        }
        if(team==10){
            System.out.println("5 fős csónakot elvitték.");
            System.out.println("3 fős csónakot elvitték.");
            System.out.println("2 fős csónakot elvitték.");
        }
        if(team>=5){
            team = team-5;
            System.out.println("5 fős csónakot elvitték.");
            if(team!=0){
                System.out.println("Még "+team+"fő mehet utánuk.");
            }
        }
        if(team>=3){
            team = team-3;
            System.out.println("3 fős csónakot elvitték.");
            if(team!=0){
                System.out.println("Még "+team+"fő mehet utánuk.");
            }
        }
        if(team>=2){
            team = team-2;
            System.out.println("2 fős csónakot elvitték.");
            if(team!=0){
                System.out.println("Még "+team+"fő mehet utánuk.");
            }
        }
        if(team==1){
            System.out.println("2 fős csónakot elvitték.");
        }

    }

}

