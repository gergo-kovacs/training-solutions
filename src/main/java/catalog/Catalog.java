package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String regNumber){
        catalogItems.removeIf(c -> c.getRegistrationNumber().equals(regNumber));
    }

    public int getAllPageNumber(){
        int sum=0;

        for (CatalogItem c:catalogItems) {
                sum+=c.numberOfPagesAtOneItem();
            }

        return sum;
    }

    public double averagePageNumberOver(int pages){
        if(pages<1){
            throw new IllegalArgumentException("Page number must be positive");
        }
        double sum=0;
        int counter=0;
        for (CatalogItem c:catalogItems) {
            if(c.numberOfPagesAtOneItem()>pages){
                sum+=c.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if(counter==0){
            throw new IllegalArgumentException("No page");
        }
        return sum/counter;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem c: catalogItems) {
            if(c.hasAudioFeature()){
                catalogItemList.add(c);
            }
        }
        return catalogItemList;
    }

    public  List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem c: catalogItems) {
            if(c.hasPrintedFeature()){
                catalogItemList.add(c);
            }
        }
        return catalogItemList;
    }

    public int getFullLength(){
        int sum=0;
        for (CatalogItem c: catalogItems) {
            sum +=c.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem item:catalogItems) {
            for (int i = 0; i < item.getTitles().size(); i++) {
                if(item.getTitles().get(i).equals(searchCriteria.getTitle())){
                    catalogItemList.add(item);
                    return catalogItemList;
                }
            }
            for (int i = 0; i < item.getFeatures().size(); i++) {
                if(item.getFeatures().get(i).getContributors().contains(searchCriteria.getContributor())){
                    catalogItemList.add(item);

                }
            }
        }
        return catalogItemList;
    }

}
