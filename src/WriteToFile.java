import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteToFile {

    private String textfile;

    public WriteToFile(String textfile) {
        this.textfile = textfile;
    }


    public void InsertFile(TreeMap<String, Integer> stebuklas) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("src/informationAboutWords.txt", true));


            for (Map.Entry<String, Integer> item : stebuklas.entrySet()) {
                System.out.println(item.getKey() + " " + item.getValue());

                write.newLine();
                write.write((item.getKey() + " " + item.getValue()));
            }
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }


    }
    public void InsertFileHN(Map<String, Integer> stebuklas) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("src/informationAboutWordsH-N.txt", true));


            for (Map.Entry<String, Integer> item : stebuklas.entrySet()) {
                System.out.println(item.getKey() + " " + item.getValue());

                write.newLine();
                write.write((item.getKey() + " " + item.getValue()));
            }
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }


    }
    public void InsertFileAG(Map<String, Integer> stebuklas) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("src/informationAboutWordsA-G.txt", true));


            for (Map.Entry<String, Integer> item : stebuklas.entrySet()) {
                System.out.println(item.getKey() + " " + item.getValue());

                write.newLine();
                write.write((item.getKey() + " " + item.getValue()));
            }
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }


    }
    public void InsertFileOU(Map<String, Integer> stebuklas) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("src/informationAboutWordsO-U.txt", true));


            for (Map.Entry<String, Integer> item : stebuklas.entrySet()) {
                System.out.println(item.getKey() + " " + item.getValue());

                write.newLine();
                write.write((item.getKey() + " " + item.getValue()));
            }
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }


    }
    public void InsertFileVZ(Map<String, Integer> stebuklas) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("src/informationAboutWordsV-Z.txt", true));


            for (Map.Entry<String, Integer> item : stebuklas.entrySet()) {
                System.out.println(item.getKey() + " " + item.getValue());

                write.newLine();
                write.write((item.getKey() + " " + item.getValue()));
            }
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }


    }
}