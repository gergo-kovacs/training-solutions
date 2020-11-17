package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons){
        Salesperson maxdiffTmpPerson=null;
        for (Salesperson persons:salespersons) {
            if(maxdiffTmpPerson==null || maxdiffTmpPerson.getDifferenceFromTarget() > persons.getDifferenceFromTarget()){
                maxdiffTmpPerson = persons;
            }
        }
        return maxdiffTmpPerson;
    }
}
