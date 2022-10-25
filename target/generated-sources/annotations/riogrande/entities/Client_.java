package riogrande.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-25T13:56:05", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> emailAddress;
    public static volatile SingularAttribute<Client, String> comments;
    public static volatile SingularAttribute<Client, String> clientName;
    public static volatile SingularAttribute<Client, String> contactNumber;
    public static volatile SingularAttribute<Client, String> clientSurname;
    public static volatile SingularAttribute<Client, String> contactAddress;
    public static volatile SingularAttribute<Client, Long> id;

}