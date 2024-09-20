package ProxyPattern.SampleExample.Problem;

public class Ebook {
    private String fileName;

    public String getFileName() {
        return fileName;
    }


    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }
    private void load(){
        System.out.println("Loading ebook " + fileName);
    }
    public void show(){
        System.out.println("showing ebook " + fileName);
    }

}
