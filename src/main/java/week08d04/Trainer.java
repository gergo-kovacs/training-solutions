package week08d04;

public class Trainer {

    public static void main(String[] args) {
        Trainer trainer =  new Trainer(new GoodMood());
        Trainer trainer2 =  new Trainer(new BadMood());
        System.out.println(trainer.giveMark());
        System.out.println(trainer2.giveMark());
    }

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;

    }

    public int giveMark(){
        return canMark.giveMark();

    }


}
