package stringbasic;

public class StringCreator {
    public String createStringForHeap(){
        String textHeap = new String("text");
        return textHeap;
    }

    public String createStringForPool(){
        String textPool = "text";
        return textPool;
    }
}
