package methodvarargs.examstats;

public class ExamStats {
    private int maxPoint;


    public ExamStats(int maxPoints) {
        this.maxPoint=maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if(isEmpty(limitInPercent,results)){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int counter = 0;
        double max = (maxPoint/100.0)*limitInPercent;
        for (int i:results) {
           if(i>max){
               counter++;
           }
        }
        return counter;
    }

    public boolean hasAnyFailed(int limitInPercent,int... results){
        if(isEmpty(limitInPercent,results)){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        double max = (maxPoint/100.0)*limitInPercent;
        for (int i:results) {
            if(i<max){
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(int number,int... numbers){
        return number==0 || numbers == null || numbers.length==0;
    }

}
