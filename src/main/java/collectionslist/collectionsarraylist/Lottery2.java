package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery2 {

    public static void main(String[] args) {
        Lottery2 lottery = new Lottery2();

        System.out.println(lottery.selectWinningNumbers(5,90));
    }

    private List<Integer> list = new ArrayList<>();

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if(!correctBallCount(lotteryType,ballCount)){
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        for (int i = 0; i < lotteryType; i++) {

            while(list.size()<lotteryType){
                if(!sameTest((int) (Math.random()*ballCount+1))){
                    list.add((int) (Math.random()*ballCount+1));
                }

            }

        }
        Collections.sort(list);
        return list;
    }

    private boolean sameTest(int number){
        return list.contains(number);
    }

    private boolean correctBallCount(int l, int b){
        return l==5 ? b==90 : b==45;
    }
}
