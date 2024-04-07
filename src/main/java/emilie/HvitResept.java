package emilie;

public class HvitResept extends Resept {
    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
        this.farge = "hvit";
    }

    @Override
    public String farge() {
        return farge;    }

    @Override
    public int prisAaBetale() {
        return hentLegemiddel().pris;
    }
}
