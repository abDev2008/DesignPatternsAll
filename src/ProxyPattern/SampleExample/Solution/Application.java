package ProxyPattern.SampleExample.Solution;

import ProxyPattern.SampleExample.Problem.Ebook;
import ProxyPattern.SampleExample.Problem.Library;

public class Application {
    public static void main(String[] args) {
        var library = new Library1();
        String[] fileNames = {"1","2","3","4","5","6","7","8","9"};
        for(var fileName : fileNames){
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("1");
//        library.openEbook("2");
    }
}
