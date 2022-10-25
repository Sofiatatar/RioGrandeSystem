
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
@Table(name="clientes")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nombre")
    private String clientName;
    @Column(name="apellido")
    private String clientSurname;
    @Column(name="telefono")
    private String contactNumber;
    @Column(name="direccion")
    private String contactAddress;
    @Column(name="email")
    private String emailAddress;
    @Column(name="comentarios")
    private String comments;

    public Client() {
    }

    public Client(Long id, String clientName, String clientSurname, String contactNumber, String contactAddress, String emailAddress, String comments) {
        this.id = id;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
        this.emailAddress = emailAddress;
        this.comments = comments;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getComments() {
        return comments;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setComments(String Comments) {
        this.comments = Comments;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", clientName=" + clientName + ", clientSurname=" + clientSurname + ", contactNumber=" + contactNumber + ", contactAddress=" + contactAddress + ", emailAddress=" + emailAddress + ", Comments=" + comments + '}';
    }

   
    
}
