import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CountWords {


    private String filename;

    public CountWords(String filename) {
        this.filename = filename;
    }

    public String[] WordFile() {
        String line = "";
        String[] vardas;
        StringBuilder lines = new StringBuilder();

        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));

            while ((line = read.readLine()) != null) {
                lines.append(line);
                lines.append(" ");





            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            vardas = lines.toString().split("\\P{Alpha}+");


        } catch (Exception e) {
            vardas = new String[0];



        }

        return vardas;

    }

    public void showText() {
        try {
            String[] lis = WordFile();
            for (String zmogus : lis) {
                System.out.println(zmogus);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


