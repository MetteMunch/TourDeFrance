public class Rider {


    private String fullName;
    private String team;

    public Rider(String fullName, String team){
        this.fullName = fullName;
        this.team = team;
    }

    public String getFullName(){
        return fullName;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString(){
        return "Name: "+fullName+", Team: "+team+"\n";
    }
}
