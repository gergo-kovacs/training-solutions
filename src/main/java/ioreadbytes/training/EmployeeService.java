package ioreadbytes.training;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {


    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.readBytesOld2();
    }


    Path path = Path.of("file");

    private void readBytes(){
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(path))) {

        } catch (IOException e) {
           throw new IllegalStateException("Can not read file");
        }
    }

    private void readBytesSlower(){
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] result = inputStream.readAllBytes();
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }
    }

    private void readBytesOld(){
        try (InputStream inputStream = new BufferedInputStream((new FileInputStream("/file.dat")))) {
        } catch (FileNotFoundException e) {
            throw new IllegalStateException("Can not found file");
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }
    }

    private void readBytesOld2(){
        File filename= new File("data.dat");
        try (InputStream inputStream = new BufferedInputStream((new FileInputStream(filename)))) {
            byte[] bytes = new byte[1000];
            int size;
            while((size=inputStream.read(bytes))>0){
                System.out.println(size);

            }
        } catch (FileNotFoundException e) {
            throw new IllegalStateException("Can not found file");
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }
    }


}
