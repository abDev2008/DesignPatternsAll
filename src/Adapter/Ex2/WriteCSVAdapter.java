package Adapter.Ex2;

public class WriteCSVAdapter implements WriteData {
    private  WriteCSV writeCSV;

    public WriteCSVAdapter(WriteCSV writeCSV) {
        this.writeCSV = writeCSV;
    }

    @Override
    public void writeJsonData(String jsonData) {
        System.out.println("Can't write json data");
    }

    @Override
    public void writeCSVData(String csvData) {
        writeCSV.writeCSVData(csvData);
    }
}
