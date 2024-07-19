package ca.ucalgary.ensf380;

/**
 * The Category class represents a category with sub-categories and super-categories.
 */
public class Category {
    private Category subCategory;
    private Category superCategory;
    private String category;

    // Getter for sub-category
    public Category getSubCategory() {
        return subCategory;
    }

    // Setter for sub-category
    public void setSubCategory(Category subCategory) {
        this.subCategory = subCategory;
    }

    // Getter for super-category
    public Category getSuperCategory() {
        return superCategory;
    }

    // Setter for super-category
    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Method for sorting
    public String sort() {
        return "Method sort called from Category";
    }
}
