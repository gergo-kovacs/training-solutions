package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    public static void main(String[] args) {
        Path path = Path.of("iowriter.music/bands_and_years.txt");
        Path pathOutPut = Path.of("iowriter.music/newBands_and_years.txt");
        BandManager bandManager = new BandManager();
        bandManager.readBandsFromFile(path);
        bandManager.writeBandsBefore(pathOutPut,1990);

    }

    List<Band> bands = new ArrayList<>();


    public void readBandsFromFile(Path inputFile) {


        try (BufferedReader br = Files.newBufferedReader(inputFile)){
            String line;

            while((line=br.readLine())!=null){
                String[] bandNameAndAge= line.split(";");

                bands.add(new Band(bandNameAndAge[0],Integer.parseInt(bandNameAndAge[1])));
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }

    }

    public void writeBandsBefore(Path outputFile, int i) {
        try (BufferedWriter writer = Files.newBufferedWriter(outputFile)) {
            for (Band band : bands) {
                if (i > band.getYear()) {
                    writer.write(band.getName() + " " + band.getYear());
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not write file.");
        }
    }
}
