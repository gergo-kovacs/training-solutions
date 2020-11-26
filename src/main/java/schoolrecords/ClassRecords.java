package schoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

private String className;
private List<Student> students= new ArrayList<>();
private Random r;

    public ClassRecords(String className,Random r) {
        this.className = className;
        this.r = r;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {

        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student){
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                students.remove(s);
                return true;
            }
        }

        return false;

    }

    public Student findStudentByName(String name){
        if(name==""){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if(students.size()==0){
            throw new IllegalStateException("No students to search!");
        }
        int i=0;
        while(!name.equals(students.get(i).getName())){
            i++;
            if(i==students.size()){
                throw new IllegalArgumentException("Student by this name cannot be found! "+name);
            }
        }

        return students.get(i);
    }

    public Student repetition(){
        if(students.size()==0){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(r.nextInt(students.size()));

    }

    public double calculateClassAverage(){
        if(students.size()==0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        for (Student s:students) {
            if(s.isEmpty()){
                throw  new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += s.calculateAverage();
        }
        return sum / (double) students.size();
    }

    public double calculateClassAverageBySubject(Subject sub){
        double sum = 0.0;
        double count =0.0;
        for (int i = 0; i < students.size();i++) {
            if (students.get(i).calculateSubjectAverage(sub) == 0.0) {
                count++;
            }
            sum += students.get(i).calculateSubjectAverage(sub);
        }

        BigDecimal bd = new BigDecimal(sum/(students.size()-count)).setScale(2, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        return result;
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResultByNames= new ArrayList<>();

        for (Student s:students) {
            s.toString();
            double d = s.calculateAverage();
            studyResultByNames.add(new StudyResultByName(s.getName(),d));
        }
        return studyResultByNames;
    }

    private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());
    }

    public String listStudentNames(){
        String text="";
        for (int i = 0; i < students.size(); i++) {
            if(i==students.size()-1){
                text +=students.get(i).getName();
            }else{
            text += students.get(i).getName()+", ";
            }
        }
        return text;
    }
}
