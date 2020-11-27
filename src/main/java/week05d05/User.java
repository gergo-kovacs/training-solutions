package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public static void main(String[] args) {
        User u = new User("Kovacs","Gergő","kovacs@gmail.com");

    }

    public User(String firstName, String lastName, String email) {
        boolean a = false;
        boolean b = false;

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
                a=true;
            }
            if(email.charAt(i)=='.'){
                b=true;
            }
        }
        if((a && b) != true){
            throw new IllegalArgumentException("@ és . az email címben kötelező!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName(){
        return firstName+" "+lastName;
    }



}
