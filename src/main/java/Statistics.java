import java.util.*;

public class Statistics {

    private List<Rider> fullList;


    public Statistics(String fileName){
        TDFFileReader tdf = new TDFFileReader(fileName);
        fullList = tdf.readFile();
    }

    public Set<String> getTeams(){
        Set<String> result = new HashSet<>();
        for(Rider r : fullList){
            result.add(r.getTeam());
        }
        return result;
    }

//    public List<Rider> getTeamsWithMembers(){
//        //TO DO lav kode
//    }

//    public Map<String,String[]> getTeamMembers(String team){
//        //TO DO lav kode
//    }


}
