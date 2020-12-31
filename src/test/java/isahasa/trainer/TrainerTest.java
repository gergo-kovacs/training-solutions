package isahasa.trainer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TrainerTest {

    @Test
    public void testWorkHasCalled(){
        WorkStub workStub = new WorkStub();
        Trainer trainer = new Trainer(workStub);
        trainer.doWork();
        Assertions.assertTrue(workStub.isCalled());

    }

    @Test
    public void testHasNoWork(){
        HasNoWork hasNoWork = new HasNoWork();
        Trainer trainer = new Trainer(hasNoWork);
        Assertions.assertEquals("",trainer.doWork());
    }

    @Test
    public void testTakeCourse(){
        TakeCourse takeCourse = new TakeCourse();
        Trainer trainer = new Trainer(takeCourse);
        Assertions.assertEquals("HappyStudents",trainer.doWork());
    }

    @Test
    public void testCreateMaterials(){
        CreateMaterials createMaterials = new CreateMaterials();
        Trainer trainer = new Trainer(createMaterials);
        Assertions.assertEquals("Materials", trainer.doWork());
    }

    @Test
    public void testComplexWork(){
        ComplexWork complexWork = new ComplexWork(Arrays.asList(new TakeCourse(),new TakeCourse()));
        Trainer trainer = new Trainer(complexWork);
        Assertions.assertEquals("HappyStudents, HappyStudents",trainer.doWork());
    }

    @Test
    public void testChangeWork(){
        Trainer trainer = new Trainer(new HasNoWork());
        Assertions.assertEquals("",trainer.doWork());
        trainer.setWork(new CreateMaterials());
        Assertions.assertEquals("Materials",trainer.doWork());
    }





}
