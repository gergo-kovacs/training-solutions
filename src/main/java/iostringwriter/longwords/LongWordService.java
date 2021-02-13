package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LongWordService {


    public void lengthWords(Writer writer, List<String> testWords) {

        PrintWriter printWriter = new PrintWriter(writer);
        for (String s: testWords) {
            printWriter.println(s+" "+s.length());
        }
    }

    public String writeWithStringWriter(List<String> testWords){

        try(StringWriter sw = new StringWriter()){
           lengthWords(sw,testWords);
            return sw.toString();
        } catch (IOException e) {
            throw new IllegalStateException("Can not write!",e);
        }
    }




}
