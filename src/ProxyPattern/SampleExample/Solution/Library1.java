package ProxyPattern.SampleExample.Solution;




import java.util.HashMap;
import java.util.Map;

public class Library1 {
    private Map<String,Ebook> ebooks = new HashMap();
    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(),ebook);
    }
    public void openEbook(String fileName){
        ebooks.get(fileName).show();
    }
}
