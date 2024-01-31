public class Products {
    private String name;
    private int quantity;
    private double price;

    public Products(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Products() {
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void increaseQuantity(int amount) {
        if (amount < 0) {
            return;
        }
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.quantity - amount < 0) {
            this.quantity = 0;
        } else {
            this.quantity -= amount;
        }
    }

    public String toString() {
        return "Ürün Adı: " + this.name + "\nÜrün Adedi: " + this.quantity + "\nÜrün Fiyatı: " + this.price + " TL\n";
    }
}