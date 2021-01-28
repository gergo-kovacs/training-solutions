package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println(lottery.selectWinningNumbers(5,90));
    }

    private List<Integer> list = new ArrayList<>();



    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
    if(!correctBallCount(lotteryType,ballCount)){
        throw new IllegalArgumentException("Balls must be more then the winning numbers!");
    }
        for (int i = 0; i < lotteryType; i++) {

            while(list.size()<lotteryType){
                int number = (int) (Math.random()*ballCount+1);
                if(!sameTest(number)){
                    list.add((int) (Math.random()*ballCount+1));
                }

            }

        }

        return setGrowingOrder(list);
    }

    private boolean sameTest(int number){
        return list.contains(number);
    }

    private List<Integer> setGrowingOrder(List<Integer> list){
        int tmp;
        for( int i = 0; i < list.size()-1; i++ )
        {
            for( int j = i+1; j < list.size(); j++ )
            {
                if( list.get(i) > list.get(j) )
                {
                    tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
        return list;
    }

    private boolean correctBallCount(int l,int b){
        if(l==5){
            return b==90;
        }else{
            return b==45;
        }
    }

}
