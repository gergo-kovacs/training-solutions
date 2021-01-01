package interfacedefaultmethods.print;

public class Printer {
      StringBuilder sb = new StringBuilder();


    public String print(Printable printable) {
        for (int i = 0; i < printable.getLength(); i++) {
            if(printable.getColor(i).equals(Printable.BLACK)){
                sb.append(printable.getPage(i)).append("\n");
            }else{
                sb.append("["+ printable.getColor(i)+"]").append(printable.getPage(i)).append("\n");
            }
        }
        return sb.toString();
    }
}
