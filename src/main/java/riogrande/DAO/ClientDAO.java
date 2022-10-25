package riogrande.DAO;

import riogrande.controller.ClientJpaController;
import riogrande.controller.exceptions.NonexistentEntityException;
import riogrande.entities.Client;

/**
 *
 * @author Sofi
 */
public class ClientDAO {
    
    private Client client = new Client();
    private ClientJpaController clientController = new ClientJpaController();
    private String message= "null";
    
    public String createClient(String clientName, String clientSurname, String contactNumber, String contactAddress, String emailAddress, String Comments) {
        
        try {
            
            client.setClientName(clientName);
            client.setClientSurname(clientSurname);
            client.setContactNumber(contactNumber);
            client.setContactAddress(contactAddress);
            client.setEmailAddress(emailAddress);
            client.setComments(Comments);
            clientController.create(client);
            message= "El cliente se guardo correctamente.";
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = "No se pudo generar el cliente.";
        }
        
        return message;
    }
    
    public String updateClient(Long id, String clientName, String clientSurname, String contactNumber, String contactAddress, String emailAddress, String Comments) {
        try {
            client.setId(id);
            client.setClientName(clientName);
            client.setClientSurname(clientSurname);
            client.setContactNumber(contactNumber);
            client.setContactAddress(contactAddress);
            client.setEmailAddress(emailAddress);
            client.setComments(Comments);
            clientController.edit(client);
            message= "El cliente se actualizo correctamente.";
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = "No se pudo actualizar el cliente.";
        }
        
        return message;
    }
    
    public String deleteClient(Long id) {
        try{
        clientController.destroy(id);
        message= "El cliente se elimino correctamente.";
        }catch (NonexistentEntityException e){
            System.out.println(e.getMessage());
            message = "No se pudo eliminar el cliente.";
        }
        return message;
    }
}
