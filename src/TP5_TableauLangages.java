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
        System.out.println(programmingLanguage);

        System.out.print("Combien de langages souhaitez-vous retirer du tableau ? ");
        int nbARetirer=keyboardInput.nextInt();

        ArrayList<String> languageToRemove=new ArrayList<>();
        for (int i = 0; i < nbARetirer; i++){
            System.out.print("Quels sont-ils ? ");
            languageToRemove.add(keyboardInput.next());
        }
        System.out.println(languageToRemove);

        for (String language:languageToRemove){
            programmingLanguage.remove(language);
        }
        System.out.println("Liste de language après retrait : " + programmingLanguage);
    }
}
