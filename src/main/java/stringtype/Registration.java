package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.println("Kérem a felhasználónevet!");
        String username = scanner.nextLine();
        if(userValidator.isValidUsername(username)){
            System.out.println("helyes");
        }else{
            System.out.println("helytelen");
        }

        System.out.println("Kérem a jelszót!");
        String password1 = scanner.nextLine();
        System.out.println("Kérem újra a jelszót!");
        String password2 = scanner.nextLine();
        if(userValidator.isValidPassword(password1,password2)){
            System.out.println("helyes");
        }else{
            System.out.println("helytelen");
        }

        System.out.println("Kérem az email címet!");
        String email = scanner.nextLine();
        if(userValidator.isValidEmail(email)){
            System.out.println("helyes");
        }else{
            System.out.println("helytelen");
        }

      /*
        System.out.println(userValidator.isValidUsername(username));
        System.out.println(userValidator.isValidPassword(password1,password2));
        System.out.println(userValidator.isValidEmail(email));
      */
    }

}
