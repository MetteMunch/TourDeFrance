import java.util.*;

public class Statistics {

    private List<Rider> fullList;


    public Statistics(String fileName) {
        TDFFileReader tdf = new TDFFileReader(fileName);
        fullList = tdf.readFile();
    }

    public Set<String> getTeams() {
        Set<String> result = new HashSet<>();
        for (Rider r : fullList) {
            result.add(r.getTeam());
        }
        return result;
    }

    public Map<String, List<String>> getTeamsWithMembers() {
        Map<String, List<String>> returnList = new TreeMap<>();
        String teamName = "";
        String riderName = "";

        for (Rider r : fullList) {
            teamName = r.getTeam();
            riderName = r.getFullName();
            //først tjekker vi om vores Map allerede indeholder Key, hvis ikke så tilføjer vi denne med en tom ArrayList.
            if(!returnList.containsKey(teamName)){
                returnList.put(teamName,new ArrayList<>());
            }
            //efter at Key er oprettet, så bruger vi denne til at tilføje navn i ArrayList.
            returnList.get(teamName).add(riderName);

        }
        return returnList;
    }

    public String getTeamMembers(String team) {
        String result = "";

        for (Rider r : fullList) {
            if (r.getTeam().equalsIgnoreCase(team)) {
                result += "\n"+r.getFullName();
            }
        }
        return "Team: "+team+", have following riders: "+result;
    }

    public List<Rider> getFullList() {
        return fullList;
    }
}



