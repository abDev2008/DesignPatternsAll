package ProxyPattern.SampleExample.Problem;

public class Application {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"1","2","3","4","5","6","7","8","9"};
        for(var fileName : fileNames){
            library.add(new Ebook(fileName));
        }

        library.openEbook("1");
    }
}
