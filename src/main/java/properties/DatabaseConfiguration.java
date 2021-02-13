package properties;

import java.io.*;
import java.util.Properties;

public class DatabaseConfiguration {

    private static String encoding ="UTF-8";
    private Properties properties;




    public DatabaseConfiguration() {
        try (InputStream is = DatabaseConfiguration.class.getResourceAsStream("properties/db.properties")) {
            properties = new Properties();
            properties.load(new InputStreamReader(is));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public DatabaseConfiguration(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            properties = new Properties();
            properties.load(new InputStreamReader(fileInputStream));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public String getHost() {
        return properties.getProperty("properties/db.host");
    }

    public String getPort() {
        return properties.getProperty("properties/db.port");
    }

    public String getSchema() {
        return properties.getProperty("db.schema");
    }
}
