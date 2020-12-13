package interfaces.paper;

public class PaperMain {

    public static void main(String[] args) {
        Paper paper = new Paper(200);

        Writeable writeable = paper;
        Erasable erasable = paper;

        writeable.write("körte");
        paper.write("alma");


    }
}
