package innlevering4;

import emilie.Resept;

import java.util.ArrayList;
import java.util.List;

public class Pasient {
    private int id;
    private String navn;
    private String foedselsnummer;
    private List<Resept> reseptListe = new ArrayList<Resept>();

    public void leggTilResept(Resept resept) {
        reseptListe.add(resept);
    }
}
