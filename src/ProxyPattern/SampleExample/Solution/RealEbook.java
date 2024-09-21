package ProxyPattern.SampleExample.Solution;

public class RealEbook implements Ebook{
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public void show() {
        System.out.println("Showing " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
    private void load(){
        System.out.println("loading the ebook "+fileName);
    }
}
