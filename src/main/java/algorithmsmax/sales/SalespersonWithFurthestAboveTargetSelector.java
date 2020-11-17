package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons){
        Salesperson maxdiffTmpPerson=null;
        for (Salesperson persons:salespersons) {
            if(maxdiffTmpPerson==null || maxdiffTmpPerson.getDifferenceFromTarget() < persons.getDifferenceFromTarget()){
                maxdiffTmpPerson = persons;
            }
        }
        return maxdiffTmpPerson;
    }
}
