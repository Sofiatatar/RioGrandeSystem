package riogrande.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import riogrande.entities.Client;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-25T13:56:05", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Double> productQuantity;
    public static volatile SingularAttribute<Orders, Double> totalOrderCost;
    public static volatile SingularAttribute<Orders, String> deliveryAddress;
    public static volatile SingularAttribute<Orders, Long> id;
    public static volatile SingularAttribute<Orders, Client> clientNumber;
    public static volatile SingularAttribute<Orders, String> deliveryDate;
    public static volatile SingularAttribute<Orders, String> deliveryRequired;
    public static volatile SingularAttribute<Orders, String> orderDate;
    public static volatile SingularAttribute<Orders, String> productName;
    public static volatile SingularAttribute<Orders, Double> productPrice;
    public static volatile SingularAttribute<Orders, String> orderState;

}