package ioconvert.shopping;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {


    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try(PrintStream printStream = new PrintStream(new BufferedOutputStream(os))){
            for(String s : shoppingList){
                printStream.println(s);
            }
        }
    }



    public List<String> loadShoppingList(InputStream is) {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while((line = reader.readLine()) != null) {
                result.add(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        return result;
    }
}
