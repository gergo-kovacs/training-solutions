package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if(fullName=="" || fullName==null){
            throw new IllegalArgumentException("Invalid Name: "+fullName);
        }else{
            this.fullName = fullName;
        }
    }

    public void changeFirstName(String firstName){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fullName);
        String replaced = stringBuilder.substring(stringBuilder.indexOf(" ")+1);
        fullName=fullName.replace(replaced,firstName);

    }

    public static void main(String[] args) {
        NameChanger nm = new NameChanger("Kovacs Gergo");
        nm.changeFirstName("David");
        System.out.println(nm.fullName);
    }

}

