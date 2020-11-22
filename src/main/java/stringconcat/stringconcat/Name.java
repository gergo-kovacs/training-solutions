package stringconcat.stringconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName) {
        if(isEmpty(familyName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;

    }

    public Name(String familyName, String middleName, String givenName, Title title) {
        if(isEmpty(familyName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGivenName() {
        return givenName;
    }

    //Mr. John G Smith
    public String concatNameWesternStyle(){
        String middle=" ";
        if(!isEmpty(getMiddleName())){
            middle=" "+getMiddleName()+" ";
        }
        if (title==null){
            return getGivenName()+middle+getFamilyName();
        }else{
        return title.getTitle()+" "+getGivenName()+middle+getFamilyName();
    }
    }

    //"Mr. Smith G John"
    public String concatNameHungarianStyle(){

        String middle=" ";
        if(!isEmpty(getMiddleName())){
            middle=" "+getMiddleName()+" ";
        }
        if (title==null){
            return getFamilyName()+middle+getGivenName();
        }else{
            return title.getTitle()+" "+getFamilyName()+middle+getGivenName();
        }
    }

    private boolean isEmpty(String name){
        if(name == null || name == ""){
            return true;
        }else{
            return false;
        }
    }

}
