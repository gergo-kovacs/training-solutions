package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();
    private int kurzor;

    public SimpleBag() {
        beforeFirst();
        kurzor = -1;
    }

    public void putItem(Object item){
        items.add(item);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public int size(){
        return items.size();
    }

    public void beforeFirst(){
        kurzor = -1;
    }


    public boolean hasNext(){
        return !items.isEmpty() && (items.size()-1)>kurzor;
    }
    public Object next(){
        kurzor++;
        return items.get(kurzor);
    }

    public boolean contains(Object item){
        for (Object o : items) {
            if (o.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public int getCursor(){
        return kurzor;
    }

    @Override
    public String toString() {
        return "SimpleBag{" +
                "items=" + items +
                ", kurzor=" + kurzor +
                '}';
    }
}
