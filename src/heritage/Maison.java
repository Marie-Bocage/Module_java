package heritage;

public class Maison extends Batiment{
    private int pieces;

    public Maison() {}

    public Maison(String adresse, int pieces) {
        super(adresse);
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "pieces=" + pieces +
                '}';
    }
}
