package ioreader.states;

public class State {

    private String StateName;
    private String Capital;

    public State(String stateName, String capital) {
        StateName = stateName;
        Capital = capital;
    }

    public String getStateName() {
        return StateName;
    }

    public String getCapital() {
        return Capital;
    }
}
