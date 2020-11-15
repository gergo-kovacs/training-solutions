package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

  public List<Type> whichType(String s){
    Long n = Long.parseLong(s);
    List<Type> types = new ArrayList<>();

    for (Type i:Type.values()) {
    if(n>i.getMinValue() && n<i.getMaxValue())
      types.add(i);
    }
    return types;
  }

}
