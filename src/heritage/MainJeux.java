package heritage;

import java.util.ArrayList;

public class MainJeux {
    public static void main(String[] args) {
        var m16=new Arme("M16", "Semi-automatique", "Armalitte", 800);
        var ak47=new Arme("Ak-47", "Semi-automatique", "Kalashnikov", 1300);
        ArrayList<Arme> mesArmes=new ArrayList<>();
        mesArmes.add(m16);
        mesArmes.add(ak47);
        var chris=new Guerrier("Christian Lisangola", 100, mesArmes);
        var marie=new Magicien("Marie Bocage", 150,"Marie Guette");
        var abdelali=new Sorcier("Abdelali Akhyat", 200, "baguette Abdel", "baton Abdel");

////        var thomas=new Personnage("Thomas RUST", 300);
//        chris.presentation();
//        marie.presentation();
//        abdelali.presentation();

//        System.out.println(chris.getArme());
//        System.out.println(chris.getArme().getName());

        ArrayList<Personnage> personnages=new ArrayList<>();

        personnages.add(chris);
        personnages.add(marie);
        personnages.add(abdelali);

        for (int i = 0; i < personnages.size(); i++) {
            System.out.println(personnages.get(i).getName());
        }

        ArrayList<EntiteVolante> personnagesVolants=new ArrayList<>();
        personnagesVolants.add(chris);
        personnagesVolants.add(abdelali);

        for (int i=0;i<personnagesVolants.size();i++){
            personnagesVolants.get(i).voler();
        }
    }
}
