import java.sql.SQLOutput;
import java.util.Scanner;

public class Controller {
    private Person vartotojas;
    private Meniu view;


    public Controller(Person vartotojas, Meniu view) {
        this.vartotojas = vartotojas;
        this.view = view;
    }

    public void failoPerskaitymas() {
        vartotojas.failoNuskaitymas();

    }

    public void failoAtvaizdavimas() {
        vartotojas.PrintList();
    }

    public void meniuParodymas() {
        view.meniuListas();
    }

    public void vartotojoIvedimas() {
        System.out.println("Prasome informacija");
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite varda");
        vartotojas.setVardas(sc.nextLine());
        System.out.println("Iveskite pavarde");
        vartotojas.setPavarde(sc.nextLine());

        boolean inputAccepted = false;
        while (!inputAccepted) {
            try {
                System.out.print("Iveskite metus: ");
                vartotojas.setMetai(Integer.valueOf(sc.nextLine()));

                inputAccepted = true;
            } catch (Exception e) {
                System.out.println("Prasome ivesti metu skaiciu!");
            }

            vartotojas.informacijosIvedimas();
            System.out.println("Ivedimas yra sekmingas!");
            vartotojas.irasytiIFaila();
        }
    }
}