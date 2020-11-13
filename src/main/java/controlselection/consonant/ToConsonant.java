package controlselection.consonant;

public class ToConsonant {

    public Character convertToConsonant(char c){
        Character result=' ';
        for (Abc i: Abc.values()) {
            if(c == i.name().toLowerCase().charAt(0)){
                result = Character.toLowerCase(i.getC());
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.convertToConsonant('e'));
    }
}
