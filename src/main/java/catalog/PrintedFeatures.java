package catalog;

import java.util.List;

public class PrintedFeatures implements Feature{
    private String title;
    private List<String> authors;
    private int numberOfPages;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(Validators.isEmpty(authors) || numberOfPages<1){
            throw  new IllegalArgumentException();
        }
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
