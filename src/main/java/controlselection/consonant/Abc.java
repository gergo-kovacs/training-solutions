package controlselection.consonant;

public enum Abc {
    A('B'), B('B'), C('C'), D('D'), E('F'),
    F('F'), G('G'), H('H'), I('J'), J('J'),
    K('K'), L('L'), M('M'), N('N'), O('P'),
    P('P'), Q('Q'), R('R'), S('S'), T('T'),
    U('V'),V('V'), W('W'), X('X'), Y('Y') ,Z('Z');

    public final char c;

    Abc(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }
}
