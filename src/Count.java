import javax.print.DocFlavor;
import java.util.Map;
import java.util.TreeMap;

public class Count {
    CountWords file;

    public Count(CountWords file) {
        this.file = file;
    }


    public TreeMap<String, Integer> countWords(String[] a) {
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        for (String zmogus : a) {
            if (tmap.get(zmogus) != null) {
                tmap.put(zmogus, tmap.get(zmogus) + 1);

            } else {

                tmap.put(zmogus, 1);
            }
        }
        return tmap;


    }

    public void parodykKaturi() {
        TreeMap<String, Integer> lis = countWords(file.WordFile());
        for (Map.Entry<String, Integer> item : lis.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }

    public void skaiciuoti(String startletter, String endletter) {


    }

    public Map<String, Integer> countWordsAG(String[] a) {
        Map<String, Integer> tmap = new TreeMap<>();
        for (String zmogus : a) {
                if (zmogus.charAt(0) >= 'a' && zmogus.charAt(0) <= 'g'|| zmogus.charAt(0) >= 'A' && zmogus.charAt(0) <= 'G') {
                    if (tmap.get(zmogus) != null) {
                    tmap.put(zmogus, tmap.get(zmogus) + 1);

                } else {

                    tmap.put(zmogus, 1);
                }
            }



        }

        return tmap;
    }
    public Map<String, Integer> countWordsHN(String[] a) {
        Map<String, Integer> tmap = new TreeMap<>();
        for (String zmogus : a) {
            if (zmogus.charAt(0) >= 'h' && zmogus.charAt(0) <= 'n'|| zmogus.charAt(0) >= 'H' && zmogus.charAt(0) <= 'N') {
                if (tmap.get(zmogus) != null) {
                    tmap.put(zmogus, tmap.get(zmogus) + 1);

                } else {

                    tmap.put(zmogus, 1);
                }
            }



        }

        return tmap;
    }
    public Map<String, Integer> countWordsOU(String[] a) {
        Map<String, Integer> tmap = new TreeMap<>();
        for (String zmogus : a) {
            if (zmogus.charAt(0) >= 'o' && zmogus.charAt(0) <= 'u'|| zmogus.charAt(0) >= 'O' && zmogus.charAt(0) <= 'U') {
                if (tmap.get(zmogus) != null) {
                    tmap.put(zmogus, tmap.get(zmogus) + 1);

                } else {

                    tmap.put(zmogus, 1);
                }
            }



        }

        return tmap;
    }
    public Map<String, Integer> countWordsVZ(String[] a) {
        Map<String, Integer> tmap = new TreeMap<>();
        for (String zmogus : a) {
            if (zmogus.charAt(0) >= 'v' && zmogus.charAt(0) <= 'z'|| zmogus.charAt(0) >= 'V' && zmogus.charAt(0) <= 'Z') {
                if (tmap.get(zmogus) != null) {
                    tmap.put(zmogus, tmap.get(zmogus) + 1);

                } else {

                    tmap.put(zmogus, 1);
                }
            }



        }

        return tmap;
    }
}
