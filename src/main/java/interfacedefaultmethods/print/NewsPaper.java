package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable{
    private final List<String> contentPage = new ArrayList<>();

    @Override
    public int getLength() {
        return contentPage.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return contentPage.get(pageNumber);
    }

    public void addPage(String page){
        contentPage.add(page);
    }
}
