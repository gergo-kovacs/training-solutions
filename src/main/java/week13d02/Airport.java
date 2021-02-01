package week13d02;

//Adott egy fájl, melyben egy reptér egy napi

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Airport {
    Path path = Path.of("src/main/resources/cities.txt");
    List<Airplane> airplanes=new ArrayList<>();

    public static void main(String[] args) {
        Airport airport = new Airport();
        List<Airplane> airplanes=new ArrayList<>();

        airport.reader(airplanes);
        for (Airplane ae:airplanes) {
            System.out.println(ae.toString());
        }
        airport.wichMoreFlight(airplanes);
        airport.getLineWithFlightNumber("EJ9251",airplanes);
        System.out.println(airport.flightToTheCity("Berlin","Departure",airplanes));
        airport.earliestLine(airplanes);
    }

    public void reader(List<Airplane> airplanesList){

    String line;

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            while((line=bufferedReader.readLine())!=null){
                String[] data=line.split(" ");
                airplanesList.add(new Airplane(data[0],data[1],data[2],data[3]));
            }
        } catch (IOException e) {
            throw  new IllegalStateException("File not found.");
        }
    }


    public void wichMoreFlight(List<Airplane> airplanes){
        int arrivalCounter=0;
        int departureCounter=0;

        for (Airplane ae:airplanes) {
            if(ae.getStatus().equals("Arrival")){
                arrivalCounter++;
            }else{
                departureCounter++;
            }
        }
        if(arrivalCounter>departureCounter){
            System.out.println("Érkező járat több");
        }else if(departureCounter>arrivalCounter){
            System.out.println("Induló járat több");
        }else{
            System.out.println("Egyformán érkezik és indul");
        }
    }

    public void getLineWithFlightNumber(String id,List<Airplane> airplanesList){

        for (Airplane ae: airplanesList) {
            if(ae.getFlightNumber().equals(id)){
                System.out.println(ae.toString());
            }
        }
    }

    public List<Airplane> flightToTheCity(String city,String status, List<Airplane> airplanes){
    List<Airplane> result= new ArrayList<>();

        for (Airplane ae: airplanes) {
            if(ae.getCity().equals(city) && ae.getStatus().equals(status)){
                result.add(ae);
            }
        }
        return result;
    }

    public void earliestLine(List<Airplane> airplanes){
        LocalTime tmp = LocalTime.of(23,59);
        for (Airplane ae:airplanes) {
            String[] t = ae.getTime().split(":");
            LocalTime time = LocalTime.of(Integer.parseInt(t[0]),Integer.parseInt(t[1]));
            if(tmp.isAfter(time)){
                tmp = time;
            }
        }
        System.out.println(tmp);
    }

}
