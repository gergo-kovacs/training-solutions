package controliteration.pi;

public class PiGenerator {


    public String getPi(){
        String vers = "Nem a régi s durva közelítés," +
                " Mi szótól szóig így kijön Betűiket " +
                "számlálva. Ludolph eredménye már, Ha itt" +
                " végezzük húsz jegyen. De rendre kijő még tíz " +
                "pontosan, Azt is bízvást ígérhetem.";
        int counter = 0;
        String text="";

        for (int i = 0; i < vers.length(); i++) {
            if(vers.charAt(i)==' '||vers.charAt(i)==','||vers.charAt(i)=='.'){
                if(counter!=0)
                text +=counter;
                if(i>2){
                 counter=-1;
                }else{
                counter=0;}
            }
            counter++;
            if(text.length()==1){
                text+=".";
                }
            }
        return text;
    }
}
