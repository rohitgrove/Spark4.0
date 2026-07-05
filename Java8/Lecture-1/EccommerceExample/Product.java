public class Product {
    private String name;
    private int price;
    private int rating;
    private String category;
    private int stock;

    public Product() {
    }

    public Product(String name, int price, int rating, String category, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", rating='" + getRating() + "'" +
                ", category='" + getCategory() + "'" +
                ", stock='" + getStock() + "'" +
                "}";
    }
}