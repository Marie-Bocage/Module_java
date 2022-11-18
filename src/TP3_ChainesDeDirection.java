import java.util.ArrayList;
import java.util.Arrays;

public class TP3_ChainesDeDirection {
    public static String arrivee(String[] tabDirection) {
        int[] pointFinal={0,0};

        for (String direction:tabDirection) { // On aurait pu utilisé un switch au lieu des if/else
            if (direction.equals("haut")) {
                pointFinal[1] += 1;
            } else if (direction.equals("bas")) {
                pointFinal[1] -= 1;
            } else if (direction.equals("gauche")) {
                pointFinal[0] -= 1;
            } else {
                pointFinal[0] += 1;
            }
        }
        return Arrays.toString(pointFinal);
    }

    public static void main(String[] args) {
        String[] tab={"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.println(arrivee(tab));
    }
}
