package stringbuilder;

public enum Title {
    MR("Mr"), MS("Ms"), DR("Dr"), PROF("Prof");

    private final String titulus;

    Title(String titulus) {
        this.titulus = titulus;
    }

    public String getTitulus() {
        return titulus;
    }
}
