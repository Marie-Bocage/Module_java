public class Point10_Foreach {
    public static void main(String[] args) {
        String[] programmingLanguage={"C", "C++", "Go", "Rust", "Java", "Typescript", "Python"};

//        for (int i = 0; i <= programmingLanguage.length - 1; i++) {
//            System.out.println(programmingLanguage[i]);
//        }

        // Boucle for each -> Utile quand on a pas besoin de se reférer aux index ou de faire des op sur le tableau
        for (String language:programmingLanguage) {
            System.out.println(language);
        }
    }
}
