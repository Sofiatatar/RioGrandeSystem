package riogrande.view;

import javax.swing.JOptionPane;
import riogrande.DAO.ClientDAO;

/**
 *
 * @author Sofi
 */
public class ClientForm extends javax.swing.JFrame {

    private ClientDAO clientDAO = new ClientDAO();

    /**
     * Creates new form clientForm
     */
    public ClientForm() {
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

        jPanel1 = new javax.swing.JPanel();
        lblClientTitle = new javax.swing.JLabel();
        lblClientName = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblContactAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        lblComments = new javax.swing.JLabel();
        btnReturnMenu = new javax.swing.JButton();
        btnDiscardClient = new javax.swing.JButton();
        btnNewClient = new javax.swing.JButton();
        lblEmailAddress = new javax.swing.JLabel();
        lblClientSurname = new javax.swing.JLabel();
        txtContactEmail = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        txtClientSurname = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtContactAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 139, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClientTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblClientTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblClientTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientTitle.setText("INGRESO DE CLIENTES");
        jPanel1.add(lblClientTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, 20));

        lblClientName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblClientName.setForeground(new java.awt.Color(255, 255, 255));
        lblClientName.setText("NOMBRE DEL CLIENTE");
        jPanel1.add(lblClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, -1));

        lblContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContactNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblContactNumber.setText("TELEFONO ");
        jPanel1.add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, -1));

        lblContactAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContactAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblContactAddress.setText("DIRECCION ");
        jPanel1.add(lblContactAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtComments.setBackground(new java.awt.Color(255, 255, 255));
        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 450, 90));

        lblComments.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblComments.setForeground(new java.awt.Color(255, 255, 255));
        lblComments.setText("OTROS COMENTARIOS");
        jPanel1.add(lblComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

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

        btnDiscardClient.setBackground(new java.awt.Color(51, 51, 51));
        btnDiscardClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDiscardClient.setForeground(new java.awt.Color(255, 255, 255));
        btnDiscardClient.setText("DESCARTAR");
        btnDiscardClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardClientActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscardClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 30));

        btnNewClient.setBackground(new java.awt.Color(51, 51, 51));
        btnNewClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewClient.setForeground(new java.awt.Color(255, 255, 255));
        btnNewClient.setText("GENERAR");
        btnNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewClientActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 140, 30));

        lblEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmailAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailAddress.setText("EMAIL ");
        jPanel1.add(lblEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, -1));

        lblClientSurname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblClientSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblClientSurname.setText("APELLIDO DEL CLIENTE");
        jPanel1.add(lblClientSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        txtContactEmail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContactEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 300, -1));

        txtClientName.setBackground(new java.awt.Color(255, 255, 255));
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 300, -1));

        txtClientSurname.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtClientSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 300, -1));

        txtContactNumber.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 300, -1));

        txtContactAddress.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContactAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewClientActionPerformed

        if (txtClientName.getText().equals("") || txtClientSurname.getText().equals("")
                || txtContactNumber.getText().equals("") || txtContactAddress.getText().equals("")
                || txtContactEmail.getText().equals("") || txtComments.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "todos los campos son obligatorios");
        } else {
            String message;
            String clientName = txtClientName.getText();
            String clientSurname = txtClientSurname.getText();
            String contactNumber = txtContactNumber.getText();
            String contactAddress = txtContactAddress.getText();
            String contactEmail = txtContactEmail.getText();
            String comments = txtComments.getText();

            message = clientDAO.createClient(clientName, clientSurname, contactNumber, contactAddress, contactEmail, comments);
            JOptionPane.showMessageDialog(this, message);
            clearAll();
        }
    }//GEN-LAST:event_btnNewClientActionPerformed

    private void btnDiscardClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardClientActionPerformed

        clearAll();
    }//GEN-LAST:event_btnDiscardClientActionPerformed

    private void btnReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMenuActionPerformed
        PrincipalMenu returnMenu = new PrincipalMenu();
        returnMenu.setVisible(true);
    }//GEN-LAST:event_btnReturnMenuActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    public void clearAll() {
        txtClientName.setText("");
        txtClientSurname.setText("");
        txtContactNumber.setText("");
        txtContactAddress.setText("");
        txtContactEmail.setText("");
        txtComments.setText("");

        JOptionPane.showMessageDialog(this, "El cliente ha sido descartado.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientForm().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardClient;
    private javax.swing.JButton btnNewClient;
    private javax.swing.JButton btnReturnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblClientSurname;
    private javax.swing.JLabel lblClientTitle;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblContactAddress;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientSurname;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtContactAddress;
    private javax.swing.JTextField txtContactEmail;
    private javax.swing.JTextField txtContactNumber;
    // End of variables declaration//GEN-END:variables
}
