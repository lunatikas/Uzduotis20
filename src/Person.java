import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String vardas;
    private String pavarde;
    private int metai;
    private String filename;


    public Person(String filename) {
        this.filename = filename;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Person(String vardas, String pavarde, int metai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.metai = metai;


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
        List<Person> lis = failoNuskaitymas();

        for (Person zmogus : lis) {
            System.out.println(zmogus.getVardas() + " " + zmogus.getPavarde() + " " + zmogus.getMetai());
        }


    }

    public void irasytiIFaila() {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(filename, true));
            write.newLine();
            write.write(informacijosIvedimas());
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }

    }

    public String informacijosIvedimas() {
        String eilute;
        eilute = vardas + " " + pavarde + " " + metai + " ";
        //for (String a:eilute


        return eilute;
    }


}
