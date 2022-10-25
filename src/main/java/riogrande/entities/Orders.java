
package riogrande.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sofi
 */
@Entity
@Table(name="pedidos")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="cliente")
    private Client clientNumber;
    @Column(name="fecha")
    private String orderDate;
    @Column(name="producto")
    private String productName;
    @Column(name="precio")
    private Double productPrice;
    @Column(name="cantidad")
    private Double productQuantity;
    @Column(name="total")
    private Double totalOrderCost;
    @Column(name="fecha de entrega")
    private String deliveryDate;
    @Column(name="direccion de entrega")
    private String deliveryAddress;
    @Column(name="estado del pedido")
    private String orderState;
    @Column(name="envio a otra ciudad")
    private String deliveryRequired;

    public Orders() {
    }

    public Orders(Long id, Client clientNumber, String orderDate, String productName, Double productPrice, Double productQuantity, Double totalOrderCost, String deliveryDate, String deliveryAddress, String orderState, String deliveryRequired) {
        this.id = id;
        this.clientNumber = clientNumber;
        this.orderDate = orderDate;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.totalOrderCost = totalOrderCost;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.orderState = orderState;
        this.deliveryRequired = deliveryRequired;
    }

    public void setClientNumber(Client clientNumber) {
        this.clientNumber = clientNumber;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(Double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setTotalOrderCost(Double totalOrderCost) {
        this.totalOrderCost = totalOrderCost;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public void setDeliveryRequired(String deliveryRequired) {
        this.deliveryRequired = deliveryRequired;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Client getClientNumber() {
        return clientNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Double getProductQuantity() {
        return productQuantity;
    }

    public Double getTotalOrderCost() {
        return totalOrderCost;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getOrderState() {
        return orderState;
    }

    public String getDeliveryRequired() {
        return deliveryRequired;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Orders{" + "id=" + id + ", clientNumber=" + clientNumber + ", orderDate=" + orderDate + ", productName=" + productName + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", totalOrderCost=" + totalOrderCost + ", deliveryDate=" + deliveryDate + ", deliveryAddress=" + deliveryAddress + ", orderState=" + orderState + ", deliveryRequired=" + deliveryRequired + '}';
    }

   
    
}
