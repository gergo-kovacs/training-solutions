package interfacerules;

public class TrainerMain {
    public static void main(String[] args) {
        HasName hasName = new Trainer();
        hasName.getName();

        CanWork canWork = new Trainer();
        canWork.doWork();

        Trainer trainer = new Trainer();
        trainer.doWork();
        trainer.getName();

        System.out.println(EmployeeType.FULL_TIME);
    }
}
