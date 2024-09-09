package StrategyPattern.Exercises.Problem;

public class ImageStorage {
    String compressor;
    String filter;
    void ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if(compressor.equals("compressor1")) {
            System.out.println("applying compressor1");
        }
        else if(compressor.equals("compressor2")) {
            System.out.println("applying compressor2");
        }
        else if(compressor.equals("compressor3")) {
            System.out.println("applying compressor3");
        }

        if(filter.equals("filter1")) {
            System.out.println("applying filter1");
        }
        else if(filter.equals("filter2")) {
            System.out.println("applying filter2");
        }
        else if(filter.equals("filter3")) {
            System.out.println("applying filter3");
        }

        System.out.println("Image stored at " + fileName);

    }
}
