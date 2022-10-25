package riogrande.view;

import javax.swing.JOptionPane;
import riogrande.DAO.OrdersDAO;
import riogrande.entities.Client;
import riogrande.entities.Orders;

/**
 *
 * @author Sofi
 */
public class OrdersForm extends javax.swing.JFrame {

    private OrdersDAO ordersDAO = new OrdersDAO();
    /**
     * Creates new form ordersForm
     */
    public OrdersForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblOrdersTitle = new javax.swing.JLabel();
        lblOrderState = new javax.swing.JLabel();
        lblClientNumber = new javax.swing.JLabel();
        lblOrdersDate = new javax.swing.JLabel();
        lblproductQuantity = new javax.swing.JLabel();
        lblTotalOrderCost = new javax.swing.JLabel();
        lblDeliveryRequired = new javax.swing.JLabel();
        lblDeliveryAddress = new javax.swing.JLabel();
        cboDeliveryRequired = new javax.swing.JComboBox<>();
        txtOrdersDate = new javax.swing.JFormattedTextField();
        btnReturnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDeliveryAddress = new javax.swing.JTextArea();
        lblDeliveryDate = new javax.swing.JLabel();
        txtTotalOrderCost = new javax.swing.JTextField();
        btnNewOrder = new javax.swing.JButton();
        btnDiscardOrder = new javax.swing.JButton();
        cboClientNumber = new javax.swing.JComboBox<>();
        lblproductPrice = new javax.swing.JLabel();
        txtProductName = new javax.swing.JFormattedTextField();
        lblProductName1 = new javax.swing.JLabel();
        txtProductQuantity = new javax.swing.JFormattedTextField();
        txtDeliveryDate = new javax.swing.JFormattedTextField();
        txtProductPrice = new javax.swing.JFormattedTextField();
        cboOrderState = new javax.swing.JComboBox<>();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 139, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrdersTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblOrdersTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdersTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrdersTitle.setText("INGRESO DE PEDIDOS");
        jPanel1.add(lblOrdersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, 20));

        lblOrderState.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrderState.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderState.setText("ESTADO DEL PEDIDO");
        jPanel1.add(lblOrderState, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        lblClientNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblClientNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblClientNumber.setText("NUMERO DE CLIENTE");
        jPanel1.add(lblClientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 20));

        lblOrdersDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrdersDate.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdersDate.setText("FECHA");
        jPanel1.add(lblOrdersDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 60, 40));

        lblproductQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblproductQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblproductQuantity.setText("CANTIDAD");
        jPanel1.add(lblproductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        lblTotalOrderCost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalOrderCost.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalOrderCost.setText("MONTO TOTAL");
        jPanel1.add(lblTotalOrderCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 120, -1));

        lblDeliveryRequired.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeliveryRequired.setForeground(new java.awt.Color(255, 255, 255));
        lblDeliveryRequired.setText("DELIVERY A OTRA CIUDAD");
        jPanel1.add(lblDeliveryRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, -1));

        lblDeliveryAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeliveryAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblDeliveryAddress.setText("DIRECCION DE ENTREGA");
        jPanel1.add(lblDeliveryAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));

        cboDeliveryRequired.setBackground(new java.awt.Color(255, 255, 255));
        cboDeliveryRequired.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel1.add(cboDeliveryRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 50, -1));

        txtOrdersDate.setBackground(new java.awt.Color(255, 255, 255));
        txtOrdersDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtOrdersDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdersDateActionPerformed(evt);
            }
        });
        txtOrdersDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrdersDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtOrdersDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 80, -1));

        btnReturnMenu.setBackground(new java.awt.Color(51, 51, 51));
        btnReturnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReturnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnMenu.setText("MENU PRINCIPAL");
        btnReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtDeliveryAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtDeliveryAddress.setColumns(20);
        txtDeliveryAddress.setRows(5);
        jScrollPane1.setViewportView(txtDeliveryAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 450, 40));

        lblDeliveryDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeliveryDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDeliveryDate.setText("FECHA DE ENTREGA");
        jPanel1.add(lblDeliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        txtTotalOrderCost.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalOrderCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalOrderCostKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotalOrderCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 90, -1));

        btnNewOrder.setBackground(new java.awt.Color(51, 51, 51));
        btnNewOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setText("GENERAR");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 140, 30));

        btnDiscardOrder.setBackground(new java.awt.Color(51, 51, 51));
        btnDiscardOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDiscardOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnDiscardOrder.setText("DESCARTAR");
        btnDiscardOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscardOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 30));

        cboClientNumber.setBackground(new java.awt.Color(255, 255, 255));
        cboClientNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboClientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));

        lblproductPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblproductPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblproductPrice.setText("PRECIO");
        jPanel1.add(lblproductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, -1));

        txtProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtProductName.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        lblProductName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProductName1.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName1.setText("PRODUCTO");
        jPanel1.add(lblProductName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 40));

        txtProductQuantity.setBackground(new java.awt.Color(255, 255, 255));
        txtProductQuantity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtProductQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductQuantityActionPerformed(evt);
            }
        });
        txtProductQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductQuantityKeyTyped(evt);
            }
        });
        jPanel1.add(txtProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 80, -1));

        txtDeliveryDate.setBackground(new java.awt.Color(255, 255, 255));
        txtDeliveryDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDeliveryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryDateActionPerformed(evt);
            }
        });
        txtDeliveryDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeliveryDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtDeliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 80, -1));

        txtProductPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtProductPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 80, -1));

        cboOrderState.setBackground(new java.awt.Color(255, 255, 255));
        cboOrderState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin realizar", "Realizado", "Entregado" }));
        jPanel1.add(cboOrderState, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrdersDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdersDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdersDateActionPerformed

    private void btnReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMenuActionPerformed
        PrincipalMenu returnMenu = new PrincipalMenu();
        returnMenu.setVisible(true);
    }//GEN-LAST:event_btnReturnMenuActionPerformed

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        
        if( cboClientNumber.getSelectedItem().equals("") || txtOrdersDate.getText().equals("") 
                || txtProductName.getText().equals("") || txtProductPrice.getText().equals("") 
                || txtProductQuantity.getText().equals("") || txtTotalOrderCost.getText().equals("") 
                || txtDeliveryDate.getText().equals("") || txtDeliveryAddress.getText().equals("") 
                || cboOrderState.getSelectedItem().equals("") || cboDeliveryRequired.getSelectedItem().equals("")){
            
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");         
        }else {
        String message;
        Client clientNumber = (Client) cboClientNumber.getSelectedItem();
        String orderDate = txtOrdersDate.getText();
        String productName = txtProductName.getText();
        Double productPrice = Double.valueOf(txtProductPrice.getText());
        Double productQuantity = Double.valueOf(txtProductQuantity.getText());
        Double totalOrderCost = Double.valueOf(txtTotalOrderCost.getText());
        String deliveryDate = txtDeliveryDate.getText();
        String deliveryAddress = txtDeliveryAddress.getText();
        String orderState = (String) cboOrderState.getSelectedItem();
        String deliveryRequired = (String) cboDeliveryRequired.getSelectedItem();

        message= ordersDAO.createOrders(clientNumber, orderDate, productName, productPrice, productQuantity, totalOrderCost, deliveryDate, deliveryAddress, orderState, deliveryRequired);
        JOptionPane.showMessageDialog(this, message);
        clearAll();
        }   
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnDiscardOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardOrderActionPerformed
        clearAll();
    }//GEN-LAST:event_btnDiscardOrderActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtProductQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductQuantityActionPerformed

    private void txtDeliveryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryDateActionPerformed

    private void txtProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductPriceActionPerformed

    private void txtProductQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductQuantityKeyTyped
        
    }//GEN-LAST:event_txtProductQuantityKeyTyped

    private void txtOrdersDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrdersDateKeyTyped
        
    }//GEN-LAST:event_txtOrdersDateKeyTyped

    private void txtDeliveryDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeliveryDateKeyTyped
       
    }//GEN-LAST:event_txtDeliveryDateKeyTyped

    private void txtTotalOrderCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalOrderCostKeyTyped
        
    }//GEN-LAST:event_txtTotalOrderCostKeyTyped

    public void clearAll(){
        
        cboClientNumber.setSelectedItem("");
        txtOrdersDate.setText("");
        txtProductName.setText("");
        txtProductPrice.setText("");
        txtProductQuantity.setText("");
        txtTotalOrderCost.setText("");
        txtDeliveryDate.setText("");
        txtDeliveryAddress.setText("");
        cboOrderState.setSelectedItem("");
        cboDeliveryRequired.setSelectedItem("");

        JOptionPane.showMessageDialog(this, "El pedido ha sido descartado.");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdersForm().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardOrder;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnReturnMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboClientNumber;
    private javax.swing.JComboBox<String> cboDeliveryRequired;
    private javax.swing.JComboBox<String> cboOrderState;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClientNumber;
    private javax.swing.JLabel lblDeliveryAddress;
    private javax.swing.JLabel lblDeliveryDate;
    private javax.swing.JLabel lblDeliveryRequired;
    private javax.swing.JLabel lblOrderState;
    private javax.swing.JLabel lblOrdersDate;
    private javax.swing.JLabel lblOrdersTitle;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblTotalOrderCost;
    private javax.swing.JLabel lblproductPrice;
    private javax.swing.JLabel lblproductQuantity;
    private javax.swing.JTextArea txtDeliveryAddress;
    private javax.swing.JFormattedTextField txtDeliveryDate;
    private javax.swing.JFormattedTextField txtOrdersDate;
    private javax.swing.JFormattedTextField txtProductName;
    private javax.swing.JFormattedTextField txtProductPrice;
    private javax.swing.JFormattedTextField txtProductQuantity;
    private javax.swing.JTextField txtTotalOrderCost;
    // End of variables declaration//GEN-END:variables

}