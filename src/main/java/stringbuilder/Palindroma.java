package stringbuilder;

public class Palindroma {

    public boolean isPalindrome(String word){
        if(word==null){
            throw new IllegalArgumentException("Text must not be null!");
        }
        StringBuilder sb = new StringBuilder(word.length());

        for (int i = word.length()-1; i >= 0; i--) {
            if(word.charAt(i)=='\n'||word.charAt(i)=='\t'){
            return true;
            }else{
            sb.append(word.charAt(i));
            }
        }
        return sb.toString().toLowerCase().equals(word.toLowerCase());
    }

}
