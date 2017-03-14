
import java.awt.image.ImageObserver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rokerecekecek
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        tfnamabrg = new javax.swing.JTextField();
        tfhargabrg = new javax.swing.JTextField();
        jumlahbrg = new javax.swing.JTextField();
        cbid = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbk = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfnamabrg.setText("Nama Barang");
        getContentPane().add(tfnamabrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 145, 140, 28));

        tfhargabrg.setText("Harga");
        getContentPane().add(tfhargabrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 191, 140, 30));

        jumlahbrg.setText("Jumlah");
        getContentPane().add(jumlahbrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 239, 140, 28));

        cbid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_barang", "pensil1", "pulpen2", "buku1", "penggaris2" }));
        cbid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidActionPerformed(evt);
            }
        });
        getContentPane().add(cbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 94, 140, 33));

        jButton1.setText("Delete");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 276, 103, 33));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 276, 103, 33));

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 276, 103, 33));

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 276, 103, 33));

        tbldta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Barang", "Nama Barang", "Harga", "Jumlah", "Total", "Nama Kasir"
            }
        ));
        jScrollPane1.setViewportView(tbldta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 94, 560, 173));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("DokChampa", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IKI TOKOKU DUK TOKOMU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 740, -1));

        cbk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Kasir", "Irsyad", "Ipin", "Sodrun" }));
        getContentPane().add(cbk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        tfnamabrg.setText("");
        tfhargabrg.setText("");
        jumlahbrg.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(cbid.getSelectedItem().equals("id_barang") || "".equals(tfnamabrg.getText()) || "".equals(tfhargabrg.getText()) || "".equals(jumlahbrg.getText()) || cbk.getSelectedItem().equals("Nama Kasir")){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            int bil = Integer.parseInt(String.valueOf(tfhargabrg.getText()));
            int bil2 = Integer.parseInt(String.valueOf(jumlahbrg.getText()));
            int total = bil*bil2;
            
            String SQL = "INSERT INTO tb_barang (id_barang,namabarang,hargabarang,jumlahbarang,total,namakasir)"
                    + "VALUES('"+cbid.getSelectedItem()+"','"+tfnamabrg.getText()+"','"+tfhargabrg.getText()+"','"+jumlahbrg.getText()+"','"+total+"','"+cbid.getSelectedItem()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Data Tansaksi");
        MessageFormat footer = new MessageFormat("Page (0,number,integer");
        try{
            tbldta.print(JTable.PrintMode.FIT_WIDTH,header,footer,true,null,true,null); 
        }catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbid;
    private javax.swing.JComboBox<String> cbk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahbrg;
    private javax.swing.JTable tbldta;
    private javax.swing.JTextField tfhargabrg;
    private javax.swing.JTextField tfnamabrg;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"id_barang","namabarang","hargabarang","jumlahbarang","total"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_barang";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while (rs.next()) {
                String id_barang = rs.getString(1);
                String namabarang = rs.getString(2);
                String hargabarang = rs.getString(3);
                String jumlahbarang = rs.getString(4);
                String total = rs.getString(5);       
                
                String data[] = {id_barang,namabarang,hargabarang,jumlahbarang,total};
                dtm.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldta.setModel(dtm);
    }
}
