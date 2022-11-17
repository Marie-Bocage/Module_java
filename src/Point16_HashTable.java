import java.util.HashMap;

public class Point16_HashTable {
    public static void main(String[] args) {
        HashMap<String,String> identite=new HashMap<>();
        // nom : Bocage
        // prenom : Marie
        // pays : France

        identite.put("nom","Bocage");
        identite.put("prenom","Marie");
        identite.put("pays","France");
//        System.out.println(identite);

        System.out.println(identite.get("nom"));
    }
}
