package properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class JavaTools {


    private static String encoding ="UTF-8";
    private Properties properties;



    public void load() {
        try (InputStream is = DatabaseConfiguration.class.getResourceAsStream("/properties/javatools.properties")) {
            properties = new Properties();
            properties.load(new InputStreamReader(is));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public Set<String> getToolKeys() {
        //Properties p = new Properties();
        Set<String> keys = properties.stringPropertyNames();
        Set<String> result = new HashSet<>();
        for (String s : keys) {
            if (s.contains("name")) {
                result.add(s.substring(0, s.indexOf('.')));
            }
        }
        return result;
    }

    public Set<String> getTools() {
        Set<String> result = new HashSet<>();
        for (String s : getToolKeys()) {
            result.add(getName(s));
        }
        return result;
    }

    public String getName(String key) {
        return properties.getProperty(key + ".name");
    }

    public String getUrl(String key) {
        return properties.getProperty(key + ".url");
    }

}
