import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockManagementGUI extends JFrame {

    private StockManagement stockManagement;

    public StockManagementGUI() {
        stockManagement = new StockManagement();
        setTitle("Stok Takip");
        setSize(1280, 960);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addButton = new JButton("Ürün Ekle");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productName = JOptionPane.showInputDialog("Ürün adı:");
                String productQuantity = JOptionPane.showInputDialog("Ürün adedi:");
                String productPrice = JOptionPane.showInputDialog("Ürün fiyatı:");
                Products product = new Products(productName, Integer.parseInt(productQuantity), Double.parseDouble(productPrice));
                stockManagement.addProduct(productName, product);
                JOptionPane.showMessageDialog(null, "Ürün eklendi.");
            }
        });

        JButton displayButton = new JButton("Stok Göster");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stockManagement.getStockInfo();
                JOptionPane.showMessageDialog(null, stockManagement.getStockInfo());
            }
        });

        JButton searchButton = new JButton("Ürün Ara");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productName = JOptionPane.showInputDialog("Ürün adı:");
                JOptionPane.showMessageDialog(null, stockManagement.getProductInfo(productName), "ÜRÜN BİLGİSİ", 1);
            }
        }); 

        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(displayButton);
        panel.add(searchButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StockManagementGUI();
            }
        });
    }
}
