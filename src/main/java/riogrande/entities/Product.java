package riogrande.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sofi
 */
@Entity
@Table(name="productos")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="producto")
    private String productName;
    @Column(name="precio de venta")
    private String salePrice;
    @Column(name="tamaño/cantidad")
    private String productSize;
    @Column(name="descripcion")
    private String description;

    public Product() {
    }

    public Product(Long id, String productName, String salePrice, String productSize, String description) {
        this.id = id;
        this.productName = productName;
        this.salePrice = salePrice;
        this.productSize = productSize;
        this.description = description;
    }

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String descripcion) {
        this.description = descripcion;
    }
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProductName() {
        return productName;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName=" + productName + ", salePrice=" + salePrice + ", productSize=" + productSize + ", descripcion=" + description + '}';
    }

   

}
