package week05d03;

import java.util.List;

public class UserValidator {

    public void validate(List<User> users){
        if(users == null){
            throw new IllegalArgumentException("Users is null");
        }
        for (User u:users) {
            if(u == null){
                throw new IllegalArgumentException("User is null");
            }
            if(u.getName() == null || u.getName().isBlank()){
                throw new IllegalArgumentException("User name can't be blank or null");
            }
            if(u.getAge()>120 || u.getAge()<0){
                throw new IllegalArgumentException("Users age must be between 0 and 120.");
            }
        }
    }
}
