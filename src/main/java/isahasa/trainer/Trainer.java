package isahasa.trainer;

public class Trainer {
    private Work work;

    public Trainer(Work work) {
        this.work = work;
    }

    public String doWork(){
        return work.complete();   //delegáláa
    }

    public void setWork(Work work){
        this.work = work;
    }




}
