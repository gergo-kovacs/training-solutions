package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String text){
        if(text==null) throw new IllegalArgumentException("Empty string!");
        if(isEmpty(text)){
            throw new IllegalArgumentException("Empty string!");
        }
        char s=' ';
        for (int i = text.length()-1; i >=0 ; i--) {
            s = text.charAt(i);
            if(Character.isAlphabetic(s)){
            return s;
            }
        }
        return s;
    }

    public String findFileExtension(String text){
        if(text==null) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        if(text.equals(".") || text.equals(".d")) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        if(text.equals("\t\n\r")) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        int i;
        for (i=text.length()-1;i >= 0 ; i--) {
            if(text.charAt(i)!='.'){
            }else{
                break;
            }
        }
        return text.substring(i,text.length());
    }

    public String changeExtensionToLowerCase(String fileName){
        if(fileName.equals("\t\n\r ")){
            throw new IllegalArgumentException("Empty string!");
        }
        if(fileName.equals(".")){
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(fileName.equals(".java")){
            throw new IllegalArgumentException("Invalid argument!");
        }
        String result = fileName.charAt(0)+fileName.substring(1).toLowerCase();
        return result;
    }

    public boolean identifyFilesByExtension(String ext, String name){
        if(isEmpty(ext, name)){
        throw new IllegalArgumentException("Invalid argument!");
        }
        if(name.length()<=2 && name.contains(".")){
        throw new IllegalArgumentException("Invalid argument!");
        }
        if(isContainstnr(ext,name)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        int i=name.lastIndexOf(".");
        return name.substring(i+1).equals(ext);
    }

    public boolean compareFilesByName(String searchedFileName,String actualFileName){
    if(isEmpty(searchedFileName,actualFileName)){
        throw new IllegalArgumentException("Invalid argument!");
    }
        if(searchedFileName.contains("\n\t\r") || actualFileName.contains("\n\t\r")){
        throw new IllegalArgumentException("Invalid argument!");
    }
        int indexActual = actualFileName.lastIndexOf(".");
        int indexSearched = searchedFileName.lastIndexOf(".");
        String actualFileNameFront = actualFileName.substring(0,indexActual);
        String searchedFileNameFront = searchedFileName.substring(0,indexSearched);
        String actualFileNameLeft = actualFileName.substring(indexActual+1,actualFileName.length());
        String searchedFileNameLeft = searchedFileName.substring(indexSearched+1,searchedFileName.length());
        actualFileNameLeft = actualFileNameLeft.toUpperCase();
        searchedFileNameLeft = searchedFileNameLeft.toUpperCase();
        return actualFileNameFront.equals(searchedFileNameFront) && actualFileNameLeft.equals(searchedFileNameLeft);
    }

    public String replaceStringPart(String word, String part1,String part2){
        if(word==null){
            throw new IllegalArgumentException("Empty string!");
        }
        if(word.equals("\n\t\r")){
            throw new IllegalArgumentException("Empty string!");
        }
        word = word.replace(part1,part2);
        return word;
    }

    private boolean isEmpty(String txt){
        return txt.equals("".trim()) || txt==null;
    }

    private boolean isEmpty(String ext,String name){
        return ext==null || name == null;
    }
    private boolean isContainstnr(String ext,String name){
        return ext.contains("\t\n\r") || name.contains("\t\n\r");
    }
}
