import java.util.HashMap;
import java.util.Map;

public class StockManagement {
    private Map<String, Products> stock;

    public StockManagement() {
        this.stock = new HashMap<>();
    }

    public void addProduct(String name, Products product) {
        stock.put(name, product);
    }

    // public void updateStock(String name, int quantity) {
    //     if (stock.containsKey(name)) {
    //         stock.put(name, quantity);
    //     } else {
    //         System.out.println("Ürün bulunamadı.");
    //     }
    // }

    public String getStockInfo() {
        StringBuilder result = new StringBuilder("Stok Durumu:\n");
        for (Map.Entry<String, Products> entry : stock.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }

    public String getProductInfo(String name) {
        if (stock.containsKey(name)) {
            Products product = stock.get(name);
            return product.toString();
        }
        else
            return "Ürün bulunamadı.";
    }
}
