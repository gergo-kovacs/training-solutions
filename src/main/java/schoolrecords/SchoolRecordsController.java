package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SchoolRecordsController {
    Random random = new Random();
    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();

    }

    List<Subject> subjectList = new ArrayList<>();
    List<Subject> teacherList = new ArrayList<>();
    ClassRecords classRecords = new ClassRecords("FirstClass",random);



    public void initSchool(){
        Subject törtenelem = new Subject("történelem");
        Subject fizika = new Subject("fizika");
        Subject irodalom = new Subject("irodalom");

        subjectList = Arrays.asList(törtenelem,fizika,irodalom);


    }


}
