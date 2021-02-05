package week14d04.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices){
    template = new Contract(client,new ArrayList<>(monthlyPrices));  //!
    }

    public Contract Create(String name){
        //return new Contract(name,new ArrayList<>(template.getMonthlyPrices()));  //!  (copyConstr.)

        return new Contract(template,name);
    }

    public static void main(String[] args) {
        ContractCreator contractCreator = new ContractCreator("John Doe",Arrays.asList(100,100,100));
        System.out.println(contractCreator.template.toString());
        Contract customer1 = contractCreator.Create("Bob");
        System.out.println(customer1.toString());
        customer1.getMonthlyPrices().set(1,200);
        customer1.getMonthlyPrices().add(500);
        System.out.println(customer1.toString());
        Contract customer2 = contractCreator.Create("Tom");
        System.out.println(customer2);



    }


}
