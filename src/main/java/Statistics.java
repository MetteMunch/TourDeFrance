import java.util.List;
import java.util.Map;
import java.util.Set;

public class Statistics {

    private List<Rider> fullList;


    public Statistics(String fileName){
        TDFFileReader tdf = new TDFFileReader(fileName);
        fullList = tdf.readFile();
    }

    public Set<Rider> getTeams(){
        //TO DO lav kode
    }

    public List<Rider> getTeamsWithMembersWhoFinished(){
        //TO DO lav kode
    }

    public Map<String,String[]> getTeamMembers(String team){
        //TO DO lav kode
    }


}
