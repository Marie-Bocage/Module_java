import org.w3c.dom.ranges.DocumentRange;

public class TP1_Occurrences {
    public static void main(String[] args) {
        int[] tab={2,7,5,6,1,7,6,2,1,7,1};

        int maxOccurrence=0;
        int elementFrequent=0;

        for (int i = 0; i < tab.length; i++) {
            int occurrence=0;
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    occurrence++;
                }
                if (maxOccurrence < occurrence) {
                    maxOccurrence=occurrence;
                    elementFrequent=tab[i];
                }
            }
        }
        System.out.printf("Le nombre le plus fréquent est %d et sa fréquence d'apparition est de %d.", elementFrequent, maxOccurrence);
    }
}
