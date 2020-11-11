package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

/*
    @Test
    public void testCreate(){
        Gentleman gentleman = new Gentleman();

        String name = gentleman.sayHello("John Doe");

        assertEquals("Hello John Doe",name);

    }
*/
    @Test
    public void testCreate2(){
        Gentleman gentleman= new Gentleman();

        String result = gentleman.sayHello();

        assertEquals("Hello Anonymus!",result);
    }

    /*
    Expected :Hello Adam Doe
    Actual   :Hello John Doe

    required: no arguments
    found:    java.lang.String
    reason: actual and formal argument lists differ in length
    */



}
