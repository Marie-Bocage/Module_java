package heritage;

import java.util.ArrayList;

public class Program {

    private ArrayList<Article> stock;

    public Program(ArrayList<Article> stock) {
        this.stock = stock;
    }

    public ArrayList<Article> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Article> stock) {
        this.stock = stock;
    }

    public boolean searchArticle(int ref) {
        for (Article article:this.stock) {
            if (this.stock.contains(article)) {

            }
        }
//        for (Article i:this.stock) {
//            if (i.getNumeroRef() != ref) {
//                System.out.println("Numero de référence incorrect");
//            } else {
//                i.toString();
         if (this.stock.contains(ref)) {
             return true;
//             this.stock.toString();
         }
         return false;
//            }
//        }
    }

    public void ajoutArticle(Article article) {
        if (article.getNumeroRef() < 0) {
            System.out.println("Numéro de référence non valide");
        } else {
            this.stock.add(article);
        }
    }

    public void supprimerArticle(int ref){
        for (Article i:this.stock) {
            if (i.getNumeroRef() != ref) {
                System.out.println("Numero de référence incorrect");
            } else {
                this.stock.remove(i);
            }
        }
    }

    public void modifierArticle(int oldRef, int newRef) {
        for (Article i:this.stock) {
            if (i.getNumeroRef() != oldRef) {
                System.out.println("Numero de référence incorrect");
            } else {
                i.setNumeroRef(newRef);
            }
        }
    }

    public void searchArticleName(String name) {
        for (Article i:this.stock) {
            if (i.getNom() != name) {
                System.out.println("Nom d'article incorrect");
            } else {
                i.toString();
            }
        }
    }

    public void searchArticlePrice(int infPrice, int maxPrice) {
        for (Article i:this.stock) {
            if (i.getPrix() >= infPrice &&i.getPrix() <= maxPrice) {
                i.toString();
            } else {
                System.out.println("Aucun article à ces prix de vente.");
            }
        }
    }

    @Override
    public String toString() {
        return "Program{" +
                "stock=" + stock +
                '}';
    }
}
