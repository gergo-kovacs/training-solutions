package properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void testProperties(){
        Properties properties = new Properties();
        properties.setProperty("host","training360.com");
        Assertions.assertEquals("training360.com",properties.getProperty("host"));
        Assertions.assertEquals(null,properties.getProperty("port"));
    }

    @Test
    public void testLoad(){
        Properties p = new Properties();
        try(InputStream inputStream = PropertiesTest.class.getResourceAsStream("/welcome.properties")){
            p.load(inputStream);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot load file",ioe);
        }
        String value = p.getProperty("welcome.message");
        Assertions.assertEquals("Hello World!",value);

    }

    @Test
    public void testSave(){
        Properties properties = new Properties();
        properties.setProperty("host", "training360.com");
        properties.setProperty("port","80");

        try(Writer writer = new FileWriter("config.properties")){
            properties.store(writer, null);
        }catch (IOException ioe){
            throw new IllegalStateException("Cannot save file",ioe);
        }
    }
}
