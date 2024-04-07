package emilie;

public class Lege {
    private String navn;
    public Lege(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Lege{" +
                "navn='" + navn + '\'' +
                '}';
    }
}