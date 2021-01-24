package exceptions.faults;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaultList {

    public List<String> processLines(List<String> list){
        if(list==null){
            throw new IllegalArgumentException();
        }

        List<String> expected = new ArrayList<>();
        List<String> line;

        for (String s : list) {
            line = Arrays.asList(s.split(","));
            if (!isLength(line)) {
                expected.add(line.get(0) + "," + ProcessingResult.WORD_COUNT_ERROR.getCode());
            } else {
                if (isInteger(line.get(0))) {
                    if (isDouble(line.get(1)) && isDate(line.get(2))) {
                        expected.add(line.get(0) + "," + ProcessingResult.VALUE_AND_DATE_ERROR.getCode());
                    } else {
                        if (isDouble(line.get(1))) {
                            expected.add(line.get(0) + "," + ProcessingResult.VALUE_ERROR.getCode());
                        }
                        if (isDate(line.get(2))) {
                            expected.add(line.get(0) + "," + ProcessingResult.DATE_ERROR.getCode());
                        }
                    }
                }
            }
        }

        return expected;
    }

    private boolean isDouble(String number){
        try{
            Double.parseDouble(number);
            return false;
        }catch (NumberFormatException nfe){
            nfe.getStackTrace();
            return true;
        }

    }

    private boolean isDate(String date){
        try {
            DateFormat dateFormat= new SimpleDateFormat("yyyy.MM.dd.");
            dateFormat.parse(date);
            return false;
        }catch (ParseException parseException){
            return true;
        }
    }

    private boolean isInteger(String number){
        try{
            Integer.parseInt(number);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }

    private boolean isLength(List<String> line){
        return line.size()==3;
    }
}
