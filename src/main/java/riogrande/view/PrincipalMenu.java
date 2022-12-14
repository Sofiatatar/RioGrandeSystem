package riogrande.view;

/**
 *
 * @author Sofi
 */
public class PrincipalMenu extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalMenu
     */
    public PrincipalMenu() {
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

        jPanel3 = new javax.swing.JPanel();
        lblMenuTitle2 = new javax.swing.JLabel();
        btnProductList = new javax.swing.JButton();
        btnNewOrderMenu = new javax.swing.JButton();
        lblNewClientMenu = new javax.swing.JButton();
        lblNewProductMenu = new javax.swing.JButton();
        btnOrdersList = new javax.swing.JButton();
        btnClientList = new javax.swing.JButton();
        lblMenuTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(170, 139, 86));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenuTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuTitle2.setText("RIO GRANDE");
        jPanel3.add(lblMenuTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 40));

        btnProductList.setBackground(new java.awt.Color(51, 51, 51));
        btnProductList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProductList.setForeground(new java.awt.Color(255, 255, 255));
        btnProductList.setText("VER PRODUCTOS");
        btnProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductListActionPerformed(evt);
            }
        });
        jPanel3.add(btnProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 180, 60));

        btnNewOrderMenu.setBackground(new java.awt.Color(51, 51, 51));
        btnNewOrderMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewOrderMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrderMenu.setText("INGRESAR PEDIDOS");
        btnNewOrderMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btnNewOrderMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 180, 60));

        lblNewClientMenu.setBackground(new java.awt.Color(51, 51, 51));
        lblNewClientMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNewClientMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblNewClientMenu.setText("INGRESAR CLIENTE");
        lblNewClientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNewClientMenuActionPerformed(evt);
            }
        });
        jPanel3.add(lblNewClientMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, 60));

        lblNewProductMenu.setBackground(new java.awt.Color(51, 51, 51));
        lblNewProductMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNewProductMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblNewProductMenu.setText("INGRESAR PRODUCTO");
        lblNewProductMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNewProductMenuActionPerformed(evt);
            }
        });
        jPanel3.add(lblNewProductMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 180, 60));

        btnOrdersList.setBackground(new java.awt.Color(51, 51, 51));
        btnOrdersList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOrdersList.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdersList.setText("VER PEDIDOS");
        btnOrdersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersListActionPerformed(evt);
            }
        });
        jPanel3.add(btnOrdersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 180, 60));

        btnClientList.setBackground(new java.awt.Color(51, 51, 51));
        btnClientList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClientList.setForeground(new java.awt.Color(255, 255, 255));
        btnClientList.setText("VER CLIENTES");
        btnClientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientListActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 180, 60));

        lblMenuTitle1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenuTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuTitle1.setText("SISTEMA DE GESTI??N");
        jPanel3.add(lblMenuTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 460, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderMenuActionPerformed
        OrdersForm orderForm = new OrdersForm();
        orderForm.setVisible(true);
    }//GEN-LAST:event_btnNewOrderMenuActionPerformed

    private void btnClientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientListActionPerformed
        ClientTable clientTable = new ClientTable();
        clientTable.setVisible(true);
    }//GEN-LAST:event_btnClientListActionPerformed

    private void lblNewClientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNewClientMenuActionPerformed
        ClientForm clientForm = new ClientForm();
        clientForm.setVisible(true);

    }//GEN-LAST:event_lblNewClientMenuActionPerformed

    private void lblNewProductMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNewProductMenuActionPerformed
        ProductForm productForm = new ProductForm();
        productForm.setVisible(true);
    }//GEN-LAST:event_lblNewProductMenuActionPerformed

    private void btnOrdersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersListActionPerformed
        OrdersTable ordersTable = new OrdersTable();
        ordersTable.setVisible(true);
    }//GEN-LAST:event_btnOrdersListActionPerformed

    private void btnProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductListActionPerformed
        ProductTable productTable = new ProductTable();
        productTable.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalMenu().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientList;
    private javax.swing.JButton btnNewOrderMenu;
    private javax.swing.JButton btnOrdersList;
    private javax.swing.JButton btnProductList;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMenuTitle1;
    private javax.swing.JLabel lblMenuTitle2;
    private javax.swing.JButton lblNewClientMenu;
    private javax.swing.JButton lblNewProductMenu;
    // End of variables declaration//GEN-END:variables
}
