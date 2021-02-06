package iofiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

    public static void main(String[] args) {
     Installer i = new Installer();
     i.install("src/main/resources/install/");
    }

    public void install(String templateMap){
        Path install = Path.of(templateMap);
        if(!Files.exists(install)){
            throw new IllegalArgumentException("The given directory doesn't exist");
        }

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Installer.class.getResourceAsStream("/install/installer.txt")))){
            String line;
            while((line=bufferedReader.readLine())!=null){
                if(line.endsWith("/")){
                    Files.createDirectory(install.resolve(line));
                }else{
                    Files.copy(Installer.class.getResourceAsStream("/install/installer.txt"),install.resolve(line));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Copy error",e);
        }

    }

}
