package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double totalValue(List<Valued> list){
    double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).getValue();
        }
        return result;
    }


}
