public class Product {
    private String id;
    private String title;
    private int price;

    public Product() {}

    public Product(String id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getID() {
        return this.id;
    }

    public void setID() {
        this.id = id;
    }

    public String gettitle() {
        return this.title;
    }

    public void settitle() {
        this.title = title;
    }

    public int getprice() {
        return this.price;
    }

    public void setprice() {
        this.price = price;
    }
}
//id, title, price
//пустой и не мпустой конструктор для присвоения полей + геттеры и сеттеры