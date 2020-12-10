package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode defaultCode;

    public SimpleDateFormatter() {
        this.defaultCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate){
        return formatDateStringByCountryCode(defaultCode,simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        if(countryCode.name().equals(CountryCode.HU.name())){
            return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
        }else if(countryCode.name().equals(CountryCode.EN.name())){
            return simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+simpleDate.getYear();
        }else{
            return simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+simpleDate.getYear();
        }
    }
}
