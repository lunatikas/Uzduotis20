import java.util.Scanner;

public class Main {
    private static String FILE_USERS = "src/informacija.txt";

    public static void main(String[] args) {
        CountWords pr = new CountWords(FILE_USERS);
        Count ct= new Count(pr);
        WriteToFile wrt= new WriteToFile(" ");
        //Meniu mn = new Meniu();
        // Controller controller= new Controller(pr,mn);
        //controller.meniuParodymas();
        // Scanner sc = new Scanner(System.in);
        //int pasirinkimas = sc.nextInt();


        //switch (pasirinkimas) {
        //  case 1:

        //    controller.failoPerskaitymas();
        //  controller.failoAtvaizdavimas();
        //break;
        //case 2:
        //  controller.vartotojoIvedimas();
        System.out.println("Iveskite kuri procesa norite atlikti");
        System.out.println("1-----Nuskaityti Tekstini faila ir atvaizduoti kiek kokiu zodziu kartojosi");
        System.out.println("2-----Nuskaityti zodziu prasidedancius tik A-G");
        System.out.println("3-----Nuskaityti zodziu prasidedancius tik H-N");
        System.out.println("4-----Nuskaityti zodziu prasidedancius tik O-U");
        System.out.println("5-----Nuskaityti zodziu prasidedancius tik V-Z");


        Scanner sc= new Scanner(System.in);
        int pasirinkimas= sc.nextInt();

        switch (pasirinkimas){
            case 1:wrt.InsertFile(ct.countWords(pr.WordFile()));
            break;
            case 2:wrt.InsertFileAG(ct.countWordsAG(pr.WordFile()));
            break;
            case 3:wrt.InsertFileHN(ct.countWordsHN(pr.WordFile()));
            break;
            case 4:wrt.InsertFileOU(ct.countWordsOU(pr.WordFile()));
            break;
            case 5:wrt.InsertFileVZ(ct.countWordsVZ(pr.WordFile()));
        }


    }


}


