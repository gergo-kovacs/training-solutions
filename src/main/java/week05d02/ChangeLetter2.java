package week05d02;

public class ChangeLetter2 {

    public String changeVowels(String text){
        if(text == "" || text == null){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        String[] vowels = {"A","E","I","O","U","a","e","i","o","u"};
        for (int i = 0; i < vowels.length; i++) {
            if (text.contains(vowels[i])) {
               text = text.replaceAll(vowels[i],"*");
            }
        }
        return text;
    }
}
