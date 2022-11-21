package heritage;

public class Sorcier extends Personnage{
    private String baguetteMagique;
    private String batonMagique;

    public Sorcier(String name, int dureeDeVie, String baguetteMagique, String batonMagique) {
        super(name, dureeDeVie);
        this.baguetteMagique = baguetteMagique;
        this.batonMagique = batonMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }
}
