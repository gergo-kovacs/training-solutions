package controlselection.week;

public class DayOfWeeks {

    public String whichDay(String day){
        String text;

        switch (day.toLowerCase()){
                case "hétfő" : text = "hét eleje";
                break;
                case "kedd" : text = "hét közepe";
                break;
                case "szerda" : text = "hét közepe";
                break;
                case "csütörtök" : text = "hét közepe";
                break;
                case "péntek" : text = "majdnem hétvége";
                break;
                case "szombat" : text = "hét vége";
                break;
                case "vasárnap" : text = "hét vége";
                break;
            default:throw new IllegalArgumentException("Invalid day: " + day);
        }
        return text;
    }
}
