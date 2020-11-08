package stringtype;

public class UserValidator {

    public boolean isValidUsername(String username){
        return username != "" ? true : false;
    }

    public boolean isValidPassword(String password1, String password2){
        return (password1.length()>=8)&&(password1.equals(password2));
    }

    public boolean isValidEmail(String email) {
        return ((email.indexOf("@") > 0 && email.indexOf(".") > 0) && ((email.indexOf(".") - 1) >
                (email.indexOf("@")))) && (email.substring(email.length() - 1) != ".");
    }
}
