package model;

public class CategorieProiect {

    private static int totalCategorii = 0;
    private final int id;
    private String categoryName;




    public CategorieProiect(String categoryName) {
        this.id = ++totalCategorii;
        this.categoryName = categoryName;
    }



    public int getId() { return id; }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }



    public String toStringy() {
        return "Date categorii produse:\nName: " + categoryName + "\nid: " + id + "\n" + "\n";
    }


}
