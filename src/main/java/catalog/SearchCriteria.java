package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    public static SearchCriteria createByBoth(String title , String contributor){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title,contributor);
    }

    public static SearchCriteria createByContributor(String contributor){
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria("",contributor);
    }

    public static SearchCriteria createByTitle(String title){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }

        return new SearchCriteria(title,"");
    }
    
    private SearchCriteria( String title,String contributor){
        this.contributor=contributor;
        this.title=title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor(){
        return getContributor().length()>0;
    }

    public boolean hasTitle(){
        return getTitle().length()>0;
    }

}
