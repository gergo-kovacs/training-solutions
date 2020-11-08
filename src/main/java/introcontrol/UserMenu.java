package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználók fevétele");
        System.out.println("Többi : Kilépés");

        System.out.println("Kérek egy számot");
        int num = scanner.nextInt();
        if(num==1){
            System.out.println("Felhasználók listázása");
        }else if(num==2){
            System.out.println("Felhasználók felvétele");
        }else{

        }
    }
}
