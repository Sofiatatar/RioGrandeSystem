package riogrande.DAO;

import riogrande.controller.ProductJpaController;
import riogrande.controller.exceptions.NonexistentEntityException;
import riogrande.entities.Product;

/**
 *
 * @author Sofi
 */
public class ProductDAO {
    
    private Product product = new Product();
    private ProductJpaController productController = new ProductJpaController();
    private String message= "null";
    
    public String createProduct(String productName, String salePrice, String productSize, String description) {
        
        try {
            product.setProductName(productName);
            product.setSalePrice(salePrice);
            product.setProductSize(productSize);
            product.setDescripcion(description);
            
            productController.create(product);
             message= "El producto se guardo correctamente.";
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = "No se pudo generar el producto.";
        }
        
        return message;
    }
    
  public String updateProduct(Long id, String productName, String salePrice, String productSize, String description) {
      try {
            product.setId(id);
            product.setProductName(productName);
            product.setSalePrice(salePrice);
            product.setProductSize(productSize);
            product.setDescripcion(description);
            productController.edit(product);
            message= "El producto se actualizo correctamente.";
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = "No se pudo actualizar el producto.";
        }
        
        return message;
     
    }
    
    public String deleteProduct(Long id) {
        try{
        productController.destroy(id);
        message= "El producto se actualizo correctamente.";
        }catch (NonexistentEntityException e){
             System.out.println(e.getMessage());
            message = "No se pudo eliminar el producto.";
        }
        return message;
    }
}
