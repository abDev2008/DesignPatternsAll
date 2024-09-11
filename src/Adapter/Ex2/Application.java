package Adapter.Ex2;

public class Application {
    public static void main(String[] args) {
        WriteCSV writeCSV = new WriteCSV();
        WriteData d = new WriteCSVAdapter(writeCSV);
        d.writeCSVData("yada");
    }
}
