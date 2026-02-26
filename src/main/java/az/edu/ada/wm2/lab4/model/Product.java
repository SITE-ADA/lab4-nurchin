package az.edu.ada.wm2.lab4.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Product {

    private UUID id;
    private String productName;
    private BigDecimal price;
    private LocalDate expirationDate;

    // 1. Parametresiz (boş) Constructor
    public Product() {
    }

    // 2. 'id' HARİÇ tüm alanları içeren Constructor
    public Product(String productName, BigDecimal price, LocalDate expirationDate) {
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // 3. TÜM alanları içeren Constructor
    public Product(UUID id, String productName, BigDecimal price, LocalDate expirationDate) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // --- Getter ve Setter Metotları ---

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public LocalDate getExpirationDate() { return expirationDate; }
    public void setExpirationDate(LocalDate expirationDate) { this.expirationDate = expirationDate; }
}

