package interfaceextensd.trainer;

import interfaceextends.trainer.HasName;
import interfaceextends.trainer.HasNameAndAge;
import interfaceextends.trainer.Trainer;

public class TrainerTest {

    public void testCreate(){
        HasName hasName = new Trainer("John Doe", 30);
        HasNameAndAge hasNameAndAge = new Trainer("John Doe", 30);



    }
}
