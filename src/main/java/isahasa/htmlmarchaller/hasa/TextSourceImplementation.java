package isahasa.htmlmarchaller.hasa;

import isahasa.htmlmarchaller.TextSource;

public class TextSourceImplementation implements TextSource {

    private String text;

    public TextSourceImplementation(String textSource) {
        this.text = textSource;
    }

    @Override
    public String getPlainText() {
        return text;
    }
}
