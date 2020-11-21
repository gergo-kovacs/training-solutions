package introexception;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;


    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if(name.equals("") || name.equals(null) ){
            throw new IllegalArgumentException("Nem megfelelő érték");
        }
        if(yearOfBirth<=1900){
            throw new IllegalArgumentException("Nem megfelelő érték");
        }
        if (!new SsnValidator().isValidSsn(socialSecurityNumber))
            throw new IllegalArgumentException("Nem megfelelő érték");

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {

        return name;
    }

    public String getSocialSecurityNumber() {

        return socialSecurityNumber;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }
}
