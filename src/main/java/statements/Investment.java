package statements;

public class Investment {

    private double cost;
    private int fund;
    private int interestRate;
    private boolean active=true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days){
        return days * ((fund * ( ((double) interestRate/100)))/365);
    }

    public double close(int days){
        if(active==false){
            return 0.0;
        }
        active=false;
        return (fund+getYield(days))+(fund+getYield(days))*0.07;
    }

}


