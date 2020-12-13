package interfaces;

public class TrainerMain {
    public static void main(String[] args) {
        //Trainer trainer = new Trainer();
        //Human human = trainer;

        Human human = new Trainer();

        HasName trainerHname = new Trainer();
        trainerHname.getName();

        HasName course = new Course();
        course.getName();
    }
}
