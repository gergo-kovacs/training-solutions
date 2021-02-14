package week15d04;

public class CovidCaseByWeek implements Comparable<CovidCaseByWeek>{

    private String week;
    private int cases;

    public CovidCaseByWeek(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    @Override
    public String toString() {
        return "CovidCaseByWeek{" +
                "week='" + week + '\'' +
                ", cases=" + cases +
                '}';
    }

    @Override
    public int compareTo(CovidCaseByWeek o) {
        return o.cases-this.cases;
    }
}
