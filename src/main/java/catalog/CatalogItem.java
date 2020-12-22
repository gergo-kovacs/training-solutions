package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CatalogItem{

    private List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... featureList) {

        this.features = List.of(featureList);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem(){
        int length=0;
        for (Feature f:features) {
            if(f instanceof AudioFeatures){
                length += ((AudioFeatures) f).getLength();
            }
        }
        return length;
    }

    public int numberOfPagesAtOneItem(){
        int pages=0;
        for (Feature f:features) {
            if(f instanceof PrintedFeatures){
               pages += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return pages;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public List<String> getContributors() {
        List<String> list = new ArrayList<>();
        for (Feature f:features) {
            list.addAll(f.getContributors());
        }
        return list;
    }

    public List<String> getTitles() {

        List<String> titles= new ArrayList<>();
        for (Feature f:features) {
            titles.add(f.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature(){
        for (Feature f:features) {
            if(f instanceof AudioFeatures){
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature f:features) {
            if(f instanceof PrintedFeatures){
                return true;
            }
        }
        return false;

    }

}



