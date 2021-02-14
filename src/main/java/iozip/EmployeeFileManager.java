package iozip;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {

    public void saveEmployees(Path path, List<String> employees) {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(
                new BufferedOutputStream(Files.newOutputStream(path)))) {

            zipOutputStream.putNextEntry(new ZipEntry("names.dat"));
            for (String s:employees) {
                zipOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
