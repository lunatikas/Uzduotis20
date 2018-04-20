import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bandymas {
    private String filename;

    public Bandymas(String filename) {
        this.filename = filename;
    }

    public List<Person> failoNuskaitymas() {
        List<Person> listas = new ArrayList<>();
        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));
            String line;
            String[] vardas;
            Person zmogus;

            while ((line = read.readLine()) != null) {
                vardas = line.split(" ");
                zmogus = new Person(vardas[0], vardas[1], Integer.parseInt(vardas[2]));
                listas.add(zmogus);


            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listas;


    }

    public void PrintList() {
        List<Person> lis=failoNuskaitymas();

        for(Person zmogus:lis){
            System.out.println(zmogus.getVardas()+zmogus.getPavarde()+zmogus.getMetai());
        }



    }
}
