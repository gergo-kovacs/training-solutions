package controlselection.accents;

public class WithoutAccents {

    public char convertToCharWithoutAccents(char c){
        String accents = "áéíóöőúüű";
        String without = "aeiooouuu";
        boolean parameter=false;
        char upperC = Character.toUpperCase(c);

        if(c == upperC){
            parameter = true;
            c=Character.toLowerCase(c);
        }

        if(accents.indexOf(c)>=0){
            char withoutAccentc = without.charAt(accents.indexOf(c));
            if(parameter==true){
                return Character.toUpperCase(withoutAccentc);
            }else{
                return withoutAccentc;
            }
        }
        return c;
    }
}
