package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode cCode = CountryCode.HU;

    public SimpleDateFormatter() {
    }

    public String formatDateString(SimpleDate simpleDate){
       return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        if(cCode.name().equals(countryCode.name())){
            return formatDateString(simpleDate);
        }else if(countryCode.name().equals(CountryCode.EN.name())){
            return simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+simpleDate.getYear();
        }else{
            return simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+simpleDate.getYear();
        }
    }
}
