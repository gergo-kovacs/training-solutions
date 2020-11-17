package algorithmsmax.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountMaxSelector {
     public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersonList){
         Salesperson max = null;
         for (Salesperson sp:salespersonList) {
             if(max == null || sp.getAmount() > max.getAmount()){
                 max = sp;
             }
         }
         return max;
     }
}
