public class TP1_BooleenPrefixe {
    public static boolean isPrefix(String chaine1, String chaine2) {
        if (chaine2.length() >= chaine1.length()) {
            return false;
        } else {
            for (int i = 0; i < chaine2.length(); i++) {
                if (chaine2.charAt(i) != chaine1.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrefix("banner","bang"));
        System.out.println(isPrefix("hugging","hug"));
        System.out.println(isPrefix("Prefixe","Pre"));
    }
}
