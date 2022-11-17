import java.util.ArrayList;
import java.util.Scanner;

public class TP5_TableauLangages {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Nombre de langages de programmation que vous voulez entrer : ");
        int nb=keyboardInput.nextInt();

        ArrayList<String> programmingLanguage=new ArrayList<>();
        for (int i = 0; i < nb; i++){
            System.out.printf("Veuillez saisir le langage de programmation n°%d : ", i + 1);
            programmingLanguage.add(keyboardInput.next());
        }
//        System.out.println(programmingLanguage);

        System.out.print("Combien de langages souhaitez-vous retirer du tableau ? ");
        int nbARetirer=keyboardInput.nextInt();

        ArrayList<String> languageToRemove=new ArrayList<>();
        int i = 0;
        do {
            if (nbARetirer > nb || nbARetirer < 1) {
                System.out.println("Nombre non valide recommencer !");
                System.out.print("Combien de langages souhaitez-vous retirer du tableau ? ");
                nbARetirer=keyboardInput.nextInt();
                continue;
            } else {
                System.out.printf("Veuillez saisir le langage n°%d à retirer : ", i +1);
                String x = keyboardInput.next();
                if (programmingLanguage.contains(x)) {
                    languageToRemove.add(x);
                    i++;
                } else {
                    System.out.println("Langage de programmation incorrect. Recommencer");
                    continue;
                }
            }
        } while (i < nbARetirer);

//        System.out.println(languageToRemove);

        // Créer une copie de la liste programmingLanguage
        ArrayList<String> newLanguageList = new ArrayList<>(programmingLanguage);
        for (String language:languageToRemove){
            newLanguageList.remove(language);
        }

        System.out.println("Liste de langages au départ : " + programmingLanguage);
        System.out.println("Liste de langages après retrait : " + newLanguageList);
    }
}
