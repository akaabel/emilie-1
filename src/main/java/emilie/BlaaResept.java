package emilie;

public class BlaaResept extends Resept {
    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
        this.farge = "blå";
    }

    @Override
    public String farge() {
        return farge;
    }

    @Override
    public int prisAaBetale() {
        return (int)Math.round(hentLegemiddel().pris * 0.25);
    }
}
