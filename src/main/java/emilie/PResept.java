package emilie;

public class PResept extends HvitResept {

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int Id, int reit) {
        super(legemiddel, utskrivendeLege, Id, reit);
    }

    @Override
    public int prisAaBetale() {
        if (hentLegemiddel().pris > 108) {
            return hentLegemiddel().pris - 108;
        } else {
            return 0;
        }
    }
}
