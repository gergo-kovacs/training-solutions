package week14d04;

import java.util.*;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices){
        template = new Contract(client, monthlyPrices);
    }

    public Contract create(String name){
        return new Contract(name, template.getMonthlyPrices());
    }

    public Contract getTemplate() {
        return template;
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("user1",new ArrayList<>(List.of(10,10,10,1,10)));  // Arrays.asList
        cc.create("Tom");

        System.out.println(cc.getTemplate().getMonthlyPrices());
        System.out.println(cc.template.getMonthlyPrices().set(1,20));
        System.out.println(cc.getTemplate().getMonthlyPrices());

    }
}
