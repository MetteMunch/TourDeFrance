public class Main {
    public static void main(String[] args) {
        Statistics st = new Statistics("src/main/resources/tdffinishers2024.csv");

        System.out.println(st.getTeams());
    }
}
