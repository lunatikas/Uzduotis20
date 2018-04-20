import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Meniu mn = new Meniu();
        mn.meniuListas();
        Scanner sc = new Scanner(System.in);
        int pasirinkimas = sc.nextInt();


        switch (pasirinkimas) {
            case 1:
                Bandymas pr = new Bandymas("src/informacija.txt");
                pr.PrintList();
                break;
        }


    }
}

