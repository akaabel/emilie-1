package emilie;

public abstract class Resept {

    private int id;
    private Legemiddel legemiddel;
    private Lege lege;
    private int pasientId, reit;
    private static int idTeller = 0;
    protected String farge;

    public Resept(Legemiddel legemiddel, int pasientId, int reit) {
        this.legemiddel = legemiddel;
        this.pasientId = pasientId;
        this.reit = reit;
        this.id = idTeller++;
    }

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        this.legemiddel = legemiddel;
        this.lege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        this.id = idTeller++;
    }

    public int hentId() {
        return pasientId;
    }

    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }

    public Lege hentLege() {
        return lege;
    }

    public int hentReit() {
        return reit;
    }

    public boolean bruk() {
        if (reit == 0) {
            return false;
        } else {
            reit--;
            return true;
        }
    }

    abstract public String farge();

    abstract public int prisAaBetale();

    @Override
    public String toString() {
        return "Resept{" +
                "id=" + id +
                ", legemiddel=" + legemiddel +
                ", lege=" + lege +
                ", pasientId=" + pasientId +
                ", reit=" + reit +
                ", farge='" + farge + '\'' +
                '}';
    }
}