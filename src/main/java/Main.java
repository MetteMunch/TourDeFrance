public class Main {
    public static void main(String[] args) {
        TDFFileReader tdf = new TDFFileReader("src/main/resources/tdffinishers2024.csv");

        System.out.println(tdf.readFile());
    }
}
