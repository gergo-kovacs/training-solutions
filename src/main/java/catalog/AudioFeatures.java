package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{
    private List<String> composer;
    private List<String> performers;
    private String title;
    private int length;


    public AudioFeatures(String title, int length,List<String> performers) {
        if(Validators.isBlank(title) || Validators.isEmpty(performers)){
            throw new IllegalArgumentException();
        }
        if(length<1){
            throw new IllegalArgumentException();
        }
        this.performers = performers;
        this.title = title;
        this.length = length;

    }

    public AudioFeatures(String title, int length, List<String> composer,List<String> performers) {
        this.performers = performers;
        this.title = title;
        this.length = length;
        this.composer = composer;
    }

    public List<String> getComposer() {
        return composer;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public int getLength() {
        return length;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (int i = 0; i < performers.size(); i++) {
            if(Validators.isEmpty(performers)){
                contributors.add(composer.get(i));
            }
            if(Validators.isEmpty(composer)){
                contributors.add(performers.get(i));
            }else{
                contributors.add(performers.get(i));
                contributors.add(composer.get(i));}
        }
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
