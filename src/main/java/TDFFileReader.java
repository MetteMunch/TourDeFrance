import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {


    private String fileName;


    public TDFFileReader(String fileName) {
        this.fileName = fileName;

    }

    public List<Rider> readFile() {
        List<Rider> fullList = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNext()) { //Denne kode kører sålænge der er en ny linje at scanne
                String lineFromFile = sc.nextLine(); //linjen scannes/indlæses til String variablen (en lang linje)
                String[] lineDivided = lineFromFile.split(";");
                String fullName = lineDivided[1];
                String team = lineDivided[2];
                fullList.add(new Rider(fullName, team));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fullList;

    }

}
