package formatlocaleprintf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;


public class PrintFormat {

    public static void main(String[] args) {
    //    PrintFormat printFormat = new PrintFormat();
      //  System.out.println(printFormat.printFormattedText(12.0));
        }

    public String formatMessageWithIntegerParameters(String formatString, Integer i, Integer j){

        try {
            return String.format(new Locale("hu", "HU"), formatString, i, j);
        } catch (MissingFormatArgumentException ex) {
            throw new IllegalArgumentException("Less objects then expected in format String!", ex);
        }
    }

    public String printFormattedText(Double number) {
        String formatString = "Total is: %,.2f Ft";

        //formatString=formatString.replace("\u00A0"," ");
        return String.format(new Locale("hu", "HU"), formatString, number);
    }

    public String printFormattedText(int count, String fruit) {
        String formatString = "We counted %d %s in the basket";

        return String.format(new Locale("hu", "HU"), formatString, count, fruit);
    }


    public String printFormattedText(int n) {

        String formatString = "Right edge of numbers set at 4 spaces from text:%4d";
        return String.format(new Locale("hu", "HU"), formatString, n);
    }

    public String printFormattedText(Integer i, Integer j, Integer k) {
        String formatString = "Multiple objects containing text:%d\t%d\t%d";
        return String.format(new Locale("hu", "HU"), formatString, i, j, k);

    }
}
