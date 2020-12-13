package interfaces.paper;

public class Paper implements Writeable, Erasable, Flat{

    //public static final int DEFAULT_CONTENT_SIZE = 100;

    private String content="";

    private int maxContentSize = DEFAULT_CONTENT_SIZE;

    public Paper() {
    }

    public Paper(int maxContentSize) {
        this.maxContentSize = maxContentSize;
    }



    @Override
    public boolean write(String text) {
        String newContent = content + text;
        if(newContent.length() <= maxContentSize){
            content = newContent;
            return true;
        }
        return false;
    }

    @Override
    public void erase() {

    }



}
