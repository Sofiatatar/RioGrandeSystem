
package riogrande.DAO;

import riogrande.controller.OrdersJpaController;
import riogrande.controller.exceptions.NonexistentEntityException;
import riogrande.entities.Client;
import riogrande.entities.Orders;


/**
 *
 * @author Sofi
 */
public class OrdersDAO {
    
    private Orders order = new Orders();
    private OrdersJpaController orderController = new OrdersJpaController();
    private String message= "null";
   
    public String createOrders(Client clientNumber, String orderDate, String productName, Double productPrice, Double productQuantity, Double totalOrderCost, String deliveryDate, String deliveryAddress, String orderState, String deliveryRequired) {

        try {

            order.setClientNumber(clientNumber);
            order.setOrderDate(orderDate);
            order.setProductName(productName);
            order.setProductPrice(productPrice);
            order.setProductQuantity(productQuantity);
            order.setTotalOrderCost(totalOrderCost);
            order.setDeliveryDate(deliveryDate);
            order.setDeliveryAddress(deliveryAddress);
            order.setOrderState(orderState);
            order.setDeliveryRequired(deliveryRequired);

            orderController.create(order);
             message= "El pedido se guardo correctamente.";
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = "No se pudo generar el pedido.";
        } 
        
        return message;

    }
    
    public String updateOrder(Long id, Client clientNumber, String orderDate, String productName, Double productPrice, Double productQuantity, Double totalOrderCost, String deliveryDate, String deliveryAddress, String orderState, String deliveryRequired) {
        try {
            order.setId(id);
            order.setClientNumber(clientNumber);
            order.setOrderDate(orderDate);
            order.setProductName(productName);
            order.setProductPrice(productPrice);
            order.setProductQuantity(productQuantity);
            order.setTotalOrderCost(totalOrderCost);
            order.setDeliveryDate(deliveryDate);
            order.setDeliveryAddress(deliveryAddress);
            order.setOrderState(orderState);
            order.setDeliveryRequired(deliveryRequired);
            orderController.edit(order);
            message= "El pedido se actualizo correctamente.";
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = "No se pudo actualizar el pedido.";
        } 
        
        return message;
    }
    
    public String deleteOrder(Long id) {
        try{
        orderController.destroy(id);
        message= "El pedido se actualizo correctamente.";
        }catch (NonexistentEntityException e){
            System.out.println(e.getMessage());
            message = "No se pudo eliminar el pedido.";
        }
        return message;
    }
}
