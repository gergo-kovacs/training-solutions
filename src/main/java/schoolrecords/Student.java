package schoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage(){
        double sum=0;
        double count=0;

        for (Mark m:marks) {

                sum+=m.getMarkType().getValue();
                count++;
            }
        if(count==0){
                   return 0.0;
                }

        //if (count != 0) {
        //            return Math.round((sum / count) * 100.0) / 100.0;
        //        }
        //        return 0.0;
        BigDecimal bd = new BigDecimal(sum/count).setScale(2, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        return (result);
    }

    public double calculateSubjectAverage(Subject subject){
        double sum=0;
        double count=0;

        for (Mark m:marks) {
            if(m.getSubject().getSubjectName().equals(subject.getSubjectName())){

                sum+=m.getMarkType().getValue();
                count++;
            }
        }
        if(count==0){
            return 0.0;
        }

        BigDecimal bd = new BigDecimal(sum/count).setScale(2, RoundingMode.HALF_UP);
                double result = bd.doubleValue();
                return result;
    }

    public void grading(Mark mark){
        if(isEmpty(mark)){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());
    }


    private boolean isEmpty(Mark marks){
        return marks == null;
    }

    public boolean isEmpty(){
        return marks.isEmpty();
    }






//"Kovács marks: matematika: excellent(5)"
    @Override
    public String toString() {
        String txt="";
        for (Mark m: marks) {
            txt=txt+" "+m.getSubject().getSubjectName()+": "+m.toString();
        }
        return name+" marks:"+txt;
    }





}
